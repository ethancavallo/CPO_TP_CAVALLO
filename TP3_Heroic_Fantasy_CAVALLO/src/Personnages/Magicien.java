/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;

/**
 *
 * @author ethan
 */
public class Magicien extends Personnage {
    static int nbMagiciens = 0;

    // Attribut spécifique au Magicien
    boolean confirme;

    // Constructeur
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);  // Appel du constructeur de Personnage
        this.confirme = confirme;
        nbMagiciens++;
    }

    @Override
    protected void finalize() throws Throwable {  // **Ajout de la méthode finalize**
        // Décrémenter le nombre de magiciens lors de la destruction
        nbMagiciens--;
        System.out.println("Un magicien a été détruit. Il reste " + nbMagiciens + " magiciens.");  // **Affichage d'un message**
        super.finalize();  // **Appel au destructeur de la classe parente**
    }
    
    @Override
    public Class<? extends Arme> typeArmePredilection() {
        return Baton.class;  // Le magicien préfère les bâtons
    }
    
     @Override
    public int compterArmesPredilection() {
        int count = 0;
        for (Arme arme : super.inventaire) {
            if (arme instanceof Baton) {
                count++;
            }
        }
        return count;  // Nombre de bâtons dans l'inventaire
    }
    
    // Setter pour confirme
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirmé : " + confirme;
    }
    
    public static int getNbMagiciens() {
        return nbMagiciens;
    }
}
