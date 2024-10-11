/*
 * TP2 ex2
 * 11/10/2024
 */
package tp2_convertisseurobjet_cavallo;

/**
 *
 * @author ethan
 */
public class TP2_convertisseurObjet_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de deux objets Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        // Exécution de quelques conversions
        System.out.println("Conversion avec convertisseur1 : Celsius vers Kelvin (25°C) -> " + convertisseur1.CelciusVersKelvin(25));
        System.out.println("Conversion avec convertisseur2 : Fahrenheit vers Celsius (77°F) -> " + convertisseur2.FarenheitVersCelcius(77));

        // Affichage du nombre de conversions pour chaque convertisseur
        System.out.println("Convertisseur1 : " + convertisseur1);
        System.out.println("Convertisseur2 : " + convertisseur2);
    }
}
