/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author ethan
 */
public abstract class Personnage {
    static int nbPersonnages = 0;

// Attributs
    String nom;
    int niveauVie;
    ArrayList<Arme> inventaire;
    Arme armeEnMain = null;
    
    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>(); 
        this.armeEnMain = null;
        nbPersonnages++;
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
}
