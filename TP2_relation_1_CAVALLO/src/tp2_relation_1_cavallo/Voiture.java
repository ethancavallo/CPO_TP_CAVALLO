/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_cavallo;

/**
 *
 * @author ethan
 */
public class Voiture {
    String modele;
    String marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String modele1, String marque1, int puissance) {
       modele = modele1;
       marque = marque1;
       PuissanceCV = puissance;
       proprietaire = null;
    }
        
    @Override
    public String toString () {
        return "Modèle : "+ modele + " Marque : " + marque + " Puissance : " + PuissanceCV;
    }
}
