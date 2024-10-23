/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cavallo;

/**
 *
 * @author ethan
 */
public class Guerrier extends Personnage {
    // Attribut spécifique au Guerrier
    private boolean aCheval;

    // Constructeur
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);  // Appel du constructeur de Personnage
        this.aCheval = aCheval;
    }

    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // Getter pour aCheval
    public boolean isACheval() {
        return aCheval;
    }

    // Méthode toString redéfinie pour inclure aCheval
    @Override
    public String toString() {
        return super.toString() + ", À cheval : " + (aCheval ? "Oui" : "Non");
    }
}
