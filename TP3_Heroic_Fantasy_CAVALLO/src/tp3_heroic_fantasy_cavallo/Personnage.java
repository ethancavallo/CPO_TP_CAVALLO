/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cavallo;

/**
 *
 * @author ethan
 */
public abstract class Personnage {
    // Attributs
    String nom;
    int niveauVie;

    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // Accesseur pour le nom du personnage
    public String getNom() {
        return nom;
    }

    // Accesseur pour le niveau de vie du personnage
    public int getNiveauVie() {
        return niveauVie;
    }

    // Méthode toString redéfinie pour afficher le nom et le niveau de vie
    @Override
    public String toString() {
        return "Personnage : " + nom + ", Niveau de vie : " + niveauVie;
    }
}
