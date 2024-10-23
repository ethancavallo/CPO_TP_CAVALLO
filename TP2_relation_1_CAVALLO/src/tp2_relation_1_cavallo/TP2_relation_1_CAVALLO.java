/*
 * TP2 ex4
 * 23/10/2024
 */
package tp2_relation_1_cavallo;

/**
 *
 * @author ethan
 */
public class TP2_relation_1_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneautre2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + 
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1] = une2008 ;
        reno.liste_voitures[0] = uneMicra ;
        reno.liste_voitures[1] = uneautre2008 ;
        reno.liste_voitures[2] = uneAutreClio ;
        bob.nbVoitures = 2 ;
        reno.nbVoitures = 3;
        une2008.proprietaire = bob;
        uneClio.proprietaire = bob ;
        uneAutreClio.proprietaire = reno;
        uneMicra.proprietaire = reno;
        uneautre2008.proprietaire = reno;

        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] + " et la seconde est " + bob.liste_voitures[1] ) ;
        System.out.println("les voiture de reno sont " + reno.liste_voitures[0] + "," + reno.liste_voitures[1] + "," + reno.liste_voitures[2]) ;
        
        System.out.println(bob.ajouter_voiture(uneClio));
    }
    
}
