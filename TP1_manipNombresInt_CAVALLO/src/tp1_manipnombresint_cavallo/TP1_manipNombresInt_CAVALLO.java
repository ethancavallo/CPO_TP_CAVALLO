/*
 * ethan cavallo
 * TP1 
 * 23/09/2024
 */
package tp1_manipnombresint_cavallo;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TP1_manipNombresInt_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Partie 1
        
        // Créer une instance de Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le premier entier
        System.out.print("Entrez le premier entier : ");
        int premierEntier = scanner.nextInt();

        // Demander à l'utilisateur de saisir le deuxième entier
        System.out.print("Entrez le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt();

        // Afficher les deux entiers saisis
        System.out.println("Vous avez saisi : " + premierEntier + " et " + deuxiemeEntier);
        
        // Afficher les deux entiers saisis
        System.out.println("Vous avez saisi : " + premierEntier + " et " + deuxiemeEntier);
        
        // Calculer la somme, la différence et le produit
        int somme = premierEntier + deuxiemeEntier;
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        
        // Calculer le quotient entier et le reste de la division euclidienne
        int quotient = premierEntier / deuxiemeEntier;
        int reste = premierEntier % deuxiemeEntier;

        // Afficher la somme, la différence et le produit
        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        
        // Afficher le quotient entier et le reste de la division euclidienne
        System.out.println("Le quotient entier de la division de " + premierEntier + " par " + deuxiemeEntier + " est : " + quotient);
        System.out.println("Le reste de la division de " + premierEntier + " par " + deuxiemeEntier + " est : " + reste);

        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();
        
    }
    
}
