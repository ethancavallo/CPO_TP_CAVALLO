/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_cavallo;

/**
 *
 * @author ethan
 */
public class BouteilleBiere {
    String nom;         // Nom de la bière
    float degreAlcool;  // Degré d'alcool de la bière
    String brasserie;   // Nom de la brasserie qui la produit
    boolean ouverte;    // Statut de la bouteille (ouverte ou non)
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \n"
            + "Brasserie : " + brasserie ) ;
    }
    public boolean Décapsuler() {
        if (ouverte == false) {
            ouverte = true;
        }
        else if (ouverte == true) {
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? "; 
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
}
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
}

