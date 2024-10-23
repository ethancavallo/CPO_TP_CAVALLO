/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cavallo;

/**
 *
 * @author ethan
 */
public class Magicien extends Personnage {
    // Attribut spécifique au Magicien
    private boolean confirme;

    // Constructeur
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);  // Appel du constructeur de Personnage
        this.confirme = confirme;
    }

    // Setter pour confirme
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    // Getter pour confirme
    public boolean isConfirme() {
        return confirme;
    }

    // Méthode toString redéfinie pour inclure confirme
    @Override
    public String toString() {
        return super.toString() + ", Confirmé : " + (confirme ? "Oui" : "Non");
    }
}
