/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author ethan
 */
public class Epee extends Arme {
    // Attribut spécifique à l'Epee
    int finesse;

    // Constructeur
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        // Validation de la finesse (doit être < 100)
        if (finesse >= 100) {
            throw new IllegalArgumentException("La finesse de l'épée doit être inférieure à 100.");
        }
        this.finesse = finesse;
    }

    // Accesseur pour la finesse
    public int getFinesse() {
        return finesse;
    }

    // Méthode toString redéfinie pour inclure la finesse
    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}
