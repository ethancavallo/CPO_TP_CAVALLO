/*
 * Ethan Cavallo
 * Exo 3 TP0
 * 17/01/2024
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //partie 2, 3, 4, 5, 6
        System.out.println("1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre entre 1 et 5 : ");
        int operateur = scanner.nextInt();
        
        while (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : Choix invalide. Veuillez entrer un nombre entre 1 et 5.");
            System.out.print("Entrez un nombre entre 1 et 5 : ");
            operateur = scanner.nextInt();
        }
        
        System.out.print("Entrez un premier nombre entier : ");
        int operande1 = scanner.nextInt();
        
        System.out.print("Entrez un second nombre entier : ");
        int operande2 = scanner.nextInt();
        scanner.close();
        
        // Traitement en fonction du choix de l'utilisateur
        switch (operateur) {
            case 1 -> System.out.println("Résultat de l'addition : " + (operande1 + operande2));
            case 2 -> System.out.println("Résultat de la soustraction : " + (operande1 - operande2));
            case 3 -> System.out.println("Résultat de la multiplication : " + (operande1 * operande2));
            case 4 -> {
                if (operande2 != 0) {
                    System.out.println("Résultat de la division : " + (operande1 / operande2));
                } else {
                    System.out.println("Erreur : Division par zéro impossible.");
                }
            }
            case 5 -> {
                if (operande2 != 0) {
                    System.out.println("Résultat du modulo : " + (operande1 % operande2));
                } else {
                    System.out.println("Erreur : Modulo par zéro impossible.");
                }
            }
            default -> System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 5.");

        }
    }
}