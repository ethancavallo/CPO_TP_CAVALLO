/*
 * Ethan Cavallo
 * 27/09/2024
 * TP1 ex4
 */
package tp1_stats_cavallo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TP1_stats_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1)
        int[] tab = new int[6];
        for (int i=0; i<6; i++) {
            tab[i]=0;
        }
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir un nombre entier
        System.out.print("Entrez un nombre entier : ");
        int m = scanner.nextInt();
        
        Random random = new Random();
        int nb = 0;
        
        for (int i=0; i<m ; i++) {
            nb = random.nextInt(5); 
            tab[nb] = tab[nb]+1;
        }
        
        double prct = 1.0;
        
        for (int i = 0; i < tab.length; i++) {
            prct = ((double ) tab[i] / m )*100.0;
            System.out.println("Élément à l'indice " + i + " : " + tab[i]+", et il est apparu pour "+prct+"% des nombres aléatoires tirés");
        }
        
                
        scanner.close();
    }
}
