/*
 * TP2 ex2
 * 11/10/2024
 */
package tp2_convertisseurobjet_cavallo;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TP2_convertisseurObjet_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Création d'un objet Convertisseur
        Convertisseur convertisseur = new Convertisseur();

        // Affichage des options de conversion
        System.out.println("Choisissez le type de conversion :");
        System.out.println("1 - Celsius vers Kelvin");
        System.out.println("2 - Kelvin vers Celsius");
        System.out.println("3 - Fahrenheit vers Celsius");
        System.out.println("4 - Celsius vers Fahrenheit");
        System.out.println("5 - Kelvin vers Fahrenheit");
        System.out.println("6 - Fahrenheit vers Kelvin");
        int choix = scanner.nextInt();

        // Demande de la valeur de température à convertir
        System.out.println("Entrez la valeur de la température à convertir :");
        double temperature = scanner.nextDouble();

        // Exécution de la conversion choisie
        switch (choix) {
            case 1:
                System.out.println("Celsius vers Kelvin (" + temperature + "°C) -> " + convertisseur.CelciusVersKelvin(temperature) + "K");
                break;
            case 2:
                System.out.println("Kelvin vers Celsius (" + temperature + "K) -> " + convertisseur.KelvinVersCelcius(temperature) + "°C");
                break;
            case 3:
                System.out.println("Fahrenheit vers Celsius (" + temperature + "°F) -> " + convertisseur.FarenheitVersCelcius(temperature) + "°C");
                break;
            case 4:
                System.out.println("Celsius vers Fahrenheit (" + temperature + "°C) -> " + convertisseur.CelciusVersFarenheit(temperature) + "°F");
                break;
            case 5:
                System.out.println("Kelvin vers Fahrenheit (" + temperature + "K) -> " + convertisseur.KelvinVersFarenheit(temperature) + "°F");
                break;
            case 6:
                System.out.println("Fahrenheit vers Kelvin (" + temperature + "°F) -> " + convertisseur.FarenheitVersKelvin(temperature) + "K");
                break;
            default:
                System.out.println("Choix invalide.");
        }

        // Affichage du nombre de conversions effectuées
        System.out.println("Nombre de conversions effectuées : " + convertisseur);

        // Fermeture du scanner
        scanner.close();
    }
}
