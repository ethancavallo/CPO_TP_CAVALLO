/*
 * ethan cavallo
 * TP1 
 * 23/09/2024
 */
package tp1_guessmynumber_cavallo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TP1_guessMyNumber_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void aide(int nb1, int nb2, int nb3) {
        // Si nombre1 est 2 ou 3, on n'affiche rien
        if (nb1 == 2 || nb1 == 3) {
            return; // On quitte la fonction
        }
        
        // Si nombre1 est 1, on compare nombre2 et nombre3
        if (nb1 == 1) {
            int difference = nb2 - nb3;

            // Si l'écart entre nombre2 et nombre3 est trop grand (on définit ici "trop grand")
            if (difference > 20) {
                System.out.println("Vraiment trop petit");
            } 
            else if (difference < -20) {
                System.out.println("Vraiment trop grand");
            } 
            else {
                System.out.println("Les nombres sont proches");
            }
        }
    }
    
    public static void main(String[] args) {
        //part 1
        
        Random generateurAleat = new Random();
        int n1 = generateurAleat.nextInt(100);
        int n2 = generateurAleat.nextInt(100);
        int n3 = generateurAleat.nextInt(100);
        int n4 = generateurAleat.nextInt(100);
        int n5 = generateurAleat.nextInt(100);
        System.out.print(n1+", "+n2+", "+n3+", "+n4+", "+n5+" ");
        
        //part 2

        // Créer une instance de Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        int nbUtilisateur = -1; // Initialisation du nombre de l'utilisateur à une valeur hors de portée
        int compteur = 0;
        
        System.out.print("Saisissez le mode de difficulte : 1=facile, 2=moyen, 3=difficile ... ");
        int modedif = scanner.nextInt();
        int maxtent = 0;
        int borneintervalle = 0;
        
        switch (modedif) {
            case 1:
                maxtent = 100000000;
                borneintervalle = 50;
                break;
            case 2:
                maxtent = 20;
                borneintervalle = 100;
                break;
            case 3:
                maxtent = 7;
                borneintervalle = 500;
                break;
            default:
                break;
        }
        
        int nbadeviner = generateurAleat.nextInt(borneintervalle);
        
        // Boucle while tant que le nombre de l'utilisateur n'est pas égal au nombre aléatoire
        while (nbUtilisateur != nbadeviner) {
            if (compteur>maxtent) { 
                System.out.println("Trop de tentatives ... Perdu !");
                break;
            }
            compteur = compteur + 1;
            // Demander à l'utilisateur de saisir un nombre entre 0 et 100
            System.out.print("Saisissez un nombre entre 0 et "+borneintervalle+", vous avez "+maxtent+" tentatives ...");
            nbUtilisateur = scanner.nextInt();

            // Comparer le nombre saisi avec le nombre aléatoire
            if (nbUtilisateur < nbadeviner) {
                System.out.println("Trop petit !");
            } else if (nbUtilisateur > nbadeviner) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Gagné ! Avec "+compteur+" tentatives !");
            }
            aide( modedif, nbUtilisateur, nbadeviner);
        }
        
        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();
    }

    }
  
