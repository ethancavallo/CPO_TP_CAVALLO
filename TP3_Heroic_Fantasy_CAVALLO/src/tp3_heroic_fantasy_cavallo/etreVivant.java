/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_fantasy_cavallo;

/**
 *
 * @author ethan
 */
public interface etreVivant {
    // Déclaration de la méthode pour réduire l'énergie ou la fatigue
    void seFatiguer();

    // Méthode qui retourne si l'être vivant est en vie ou non
    boolean estVivant();

    // Méthode pour subir une attaque, en réduisant les points de vie
    void estAttaque(int points);
}
