/*
 * TP3 ex1
 * 23/10/2024
 */
package tp3_heroic_fantasy_cavallo;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author ethan
 */
public class TP3_Heroic_Fantasy_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        
        // Création d'un tableau dynamique avec ArrayList pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des épées et des bâtons dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques des armes en parcourant le tableau
        for (int i = 0; i < armes.size(); i++) {
            // Utilisation de la méthode toString de chaque arme pour afficher ses caractéristiques
            System.out.println(armes.get(i));
        }
    }
    
}
