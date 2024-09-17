/*
 * Ethan Cavallo
 * Exo2 TP0
 * 17/01/2024
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
            int nb; //nombre d'entiers à additionner
            int result; // resultat
            int ind; //indice5
            //nb=5;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Entrer le nombre :");
            nb=sc.nextInt(); // on demande a sc de donner le prochain entier
            result=0;
            
            //Addition des nb premiers entiers
            ind=1;
            while (ind <= nb) {
                result=result+ind;
                ind+=1;
            }
            
            //Affichage du resultat
            System.out.println();
            System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
