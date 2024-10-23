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
public class Baton extends Arme {
    // Attribut spécifique au Baton
    int age;

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        // Validation de l'âge (doit être < 100)
        if (age >= 100) {
            throw new IllegalArgumentException("L'âge du bâton doit être inférieur à 100.");
        }
        this.age = age;
    }

    // Accesseur pour l'âge
    public int getAge() {
        return age;
    }

    // Méthode toString redéfinie pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }
}
