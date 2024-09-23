/*
 * ethan cavallo
 * TP1 
 * 23/09/2024
 */
package tp1_convertisseur_cavallo;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class TP1_convertisseur_CAVALLO {

    /**
     * @param args the command line arguments
     */
    
    // Méthode pour convertir Celsius vers Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    // Méthode pour convertir Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit vers Celsius
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius vers Fahrenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin vers Fahrenheit (en utilisant KelvinVersCelcius et CelciusVersFarenheit)
    public static double KelvinVersFarenheit(double tKelvin) {
        double tempCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tempCelcius);
    }

    // Méthode pour convertir Fahrenheit vers Kelvin (en utilisant FarenheitVersCelcius et CelciusVersKelvin)
    public static double FarenheitVersKelvin(double tFarenheit) {
        double tempCelcius = FarenheitVersCelcius(tFarenheit);
        return CelciusVersKelvin(tempCelcius);
    }

    public static void main(String[] args) {
        // Créer une instance de Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une température en degrés Celsius
        System.out.print("Bonjour, saisissez une valeur : ");
        double temp = scanner.nextDouble();
        
        System.out.print("Saisissez la conversion que vous souhaiter effectuer : ");
        int conversion = scanner.nextInt();
        
        double tempconv = 0; 
        String temp1 = ""; 
        String temp2 = "";

        switch(conversion) {
            case 1:
                tempconv = CelciusVersKelvin ( temp );
                temp1 = "Celcius";
                temp2 = "Kelvin";
                break;
            case 2:
                tempconv = KelvinVersCelcius ( temp );
                temp1 = "Kelvin";
                temp2 = "Celcius";
                break;
            case 3:
                tempconv = FarenheitVersCelcius ( temp );
                temp1 = "Farenheit";
                temp2 = "Celcius";
                break;
            case 4:
                tempconv = CelciusVersFarenheit ( temp );
                temp1 = "Celcius";
                temp2 = "Farenheit";
                break;
            case 5:
                tempconv = KelvinVersFarenheit ( temp );
                temp1 = "Kelvin";
                temp2 = "Farenheit";
                break;
            case 6:
                tempconv = FarenheitVersKelvin ( temp );
                temp1 = "Farenheit";
                temp2 = "Kelvin";
                break;
        } 
        
                System.out.print(temp+" degres "+temp1+" est egal a "+tempconv+" degres "+temp2);
        
        // Fermer le scanner pour éviter les fuites de ressources
        scanner.close();
    }
    
}
