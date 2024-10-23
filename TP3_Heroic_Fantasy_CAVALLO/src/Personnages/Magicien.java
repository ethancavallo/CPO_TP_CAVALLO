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
    public Class<? extends Arme> typeArmePredilection() {
        return Baton.class;  // Le magicien préfère les bâtons
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
