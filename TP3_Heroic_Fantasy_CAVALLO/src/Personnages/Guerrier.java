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
    // Attribut spécifique au Guerrier
    boolean aCheval;

    // Constructeur
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);  // Appel du constructeur de Personnage
        this.aCheval = aCheval;
    }

    @Override
    public Class<? extends Arme> typeArmePredilection() {
        return Epee.class;  // Le guerrier préfère les épées
    }
    
    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

   @Override
    public String toString() {
        return super.toString() + ", À cheval : " + aCheval;
    }
}
