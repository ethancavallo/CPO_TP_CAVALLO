/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ethan
 */
public abstract class Arme {
    // Attributs
    String nom;
    int niveauAttaque;

    // Constructeur
    public Arme(String nom, int niveauAttaque) {
        // Validation du niveau d'attaque (<=100)
        if (niveauAttaque > 100) {
            throw new IllegalArgumentException("Le niveau d'attaque ne peut pas dépasser 100.");
        }
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    // Accesseur pour le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Accesseur pour le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode toString redéfinie pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}
