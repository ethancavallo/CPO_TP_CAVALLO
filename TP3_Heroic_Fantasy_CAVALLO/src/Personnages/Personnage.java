/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_cavallo.etreVivant;

/**
 *
 * @author ethan
 */
public abstract class Personnage implements etreVivant {
    static int nbPersonnages = 0;

// Attributs
    String nom;
    int niveauVie;
    ArrayList<Arme> inventaire;
    Arme armeEnMain = null;
    private boolean vivant = true; // Pour garder l'état de vie du personnage
    
    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>(); 
        this.armeEnMain = null;
        nbPersonnages++;
    }

    @Override
    protected void finalize() throws Throwable {  // **Ajout de la méthode finalize**
        // Décrémenter le nombre de personnages lors de la destruction
        nbPersonnages--;
        System.out.println("Un personnage a été détruit. Il reste " + nbPersonnages + " personnages.");  // **Affichage d'un message**
        super.finalize();  // **Appel au destructeur de la classe parente**
    }
    
    // Accesseur pour le nom du personnage
    public String getNom() {
        return nom;
    }

    // Accesseur pour le niveau de vie du personnage
    public int getNiveauVie() {
        return niveauVie;
    }

    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
            System.out.println(arme.getNom() + " a été ajoutée à l'inventaire.");
        } else {
            System.out.println("Inventaire plein, impossible d'ajouter une autre arme.");
        }
    }
    
    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    
    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nomArme + " est maintenant équipée.");
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'est pas dans l'inventaire.");
    }
    
    public abstract Class<? extends Arme> typeArmePredilection();

    public int compterArmesPredilection() {
        int count = 0;
        for (Arme arme : inventaire) {
            if (typeArmePredilection().isInstance(arme)) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public String toString() {
        return "Personnage : " + nom + ", Niveau de vie : " + niveauVie +
               (armeEnMain != null ? ", Arme en main : " + armeEnMain : ", Pas d'arme en main.");
    }
    
    public static int getNbPersonnages() {
        return nbPersonnages;
    }
    
    @Override
    public void seFatiguer() {
        niveauVie -= 10;
        System.out.println(nom + " se fatigue et perd 10 points de vie.");
    }

    @Override
    public boolean estVivant() {
        return niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
        System.out.println(nom + " est attaqué et perd " + points + " points de vie.");
    }
    
    // Méthode pour attaquer un autre personnage
    public void attaquer(Personnage adversaire) {
        if (this.armeEnMain == null) {
            System.out.println(this.nom + " n'a pas d'arme équipée et ne peut pas attaquer.");
            return;
        }

        int degats = this.armeEnMain.getNiveauAttaque();

        // Cas où le personnage est un Magicien
        if (this instanceof Magicien && armeEnMain instanceof Baton) {
            Baton baton = (Baton) armeEnMain;
            degats *= baton.getAge();
            seFatiguer(); // Le magicien se fatigue en attaquant
        }

        // Cas où le personnage est un Guerrier
        else if (this instanceof Guerrier && armeEnMain instanceof Epee) {
            Epee epee = (Epee) armeEnMain;
            degats *= epee.getFinesse();
            seFatiguer(); // Le guerrier se fatigue en attaquant
        }

        if ((this instanceof Magicien && ((Magicien) this).isConfirme()) ||
        (this instanceof Guerrier && ((Guerrier) this).isACheval())) {
        degats /= 2;
        }

        // Appliquer les dégâts à l'adversaire
        adversaire.estAttaque(degats);
        System.out.println(this.nom + " a attaqué " + adversaire.getNom() + " et lui a infligé " + degats + " points de dégâts.");
    }
}
