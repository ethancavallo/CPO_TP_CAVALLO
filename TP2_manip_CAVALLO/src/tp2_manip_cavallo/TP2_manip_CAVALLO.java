/*
 * 16/10/2024
 * TP2 ex3
 */
package tp2_manip_cavallo;

/**
 *
 * @author ethan
 */
public class TP2_manip_CAVALLO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories + "\n nb de calories de Assiette 3 : " + assiette3.nbCalories);
        assiette3.nbCalories += 100;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories + "\n nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories + "\nnb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        int x = assiette1.nbCalories;
        assiette1.nbCalories = assiette2.nbCalories;
        assiette2.nbCalories = x;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories + "\nnb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        // Non, une référence d'objet ne peut pas référencer un objet d'un type différent qui n'a aucun rapport.
        
        // Création d'un tableau de 10 références de type Moussaka
        Moussaka[] moussakas = new Moussaka[10];
        
        // Boucle pour créer 10 objets Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(300 + (i * 100)); // Par exemple, 300, 400, ..., 1200 calories
        }
    }
    
}
