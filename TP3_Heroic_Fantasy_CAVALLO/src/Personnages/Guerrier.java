/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author ethan
 */
public class Guerrier extends Personnage {
    static int nbGuerriers = 0;

// Attribut spécifique au Guerrier
    boolean aCheval;

    // Constructeur
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);  // Appel du constructeur de Personnage
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    @Override
    protected void finalize() throws Throwable {  // **Ajout de la méthode finalize**
        // Décrémenter le nombre de guerriers lors de la destruction
        nbGuerriers--;
        System.out.println("Un guerrier a été détruit. Il reste " + nbGuerriers + " guerriers.");  // **Affichage d'un message**
        super.finalize();  // **Appel au destructeur de la classe parente**
    }
    
    @Override
    public Class<? extends Arme> typeArmePredilection() {
        return Epee.class;  // Le guerrier préfère les épées
    }
    
    @Override
    public int compterArmesPredilection() {
        int count = 0;
        for (Arme arme : super.inventaire) {
            if (arme instanceof Epee) {
                count++;
            }
        }
        return count;  // Nombre d'épées dans l'inventaire
    }
    
    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

   @Override
    public String toString() {
        return super.toString() + ", À cheval : " + aCheval;
    }
    
    public static int getNbGuerriers() {
        return nbGuerriers;
    }
}
