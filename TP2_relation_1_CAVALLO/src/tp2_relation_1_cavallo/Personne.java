/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_cavallo;

/**
 *
 * @author ethan
 */
public class Personne {
    String nom;
    String prenom; 
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
    public Personne(String nom1, String prenom1) {
        nom = nom1;
        prenom = prenom1;
        liste_voitures = new Voiture [3] ;
        nbVoitures = 0;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }
        if (nbVoitures >= 3) {
           return false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter ;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this ;
        return true;
    }
    
    @Override
    public String toString () {
        return "Nom : "+ nom + " Prenom : " + prenom;
    }
}
