/*
 * TP2 ex1
 * 11/10/2024
 */
package tp2_bieres_cavallo;

/**
 *
 * @author ethan
 */
public class TP2_Bieres_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0 ,"Dubuisson") ;
        BouteilleBiere deuxbiere = new BouteilleBiere("Leffe", (float) 6.6 ,"Abbaye de Leffe") ;
        BouteilleBiere troisbiere = new BouteilleBiere("Heineken", (float) 7.2 ,"aucuneidee") ;
        BouteilleBiere quatrebiere = new BouteilleBiere("Desperados", (float) 5.4 ,"jesaispas") ;
        BouteilleBiere cinqbiere = new BouteilleBiere("Guiness", (float) 4.3 ,"Ireland") ;
        uneBiere.Décapsuler();
        troisbiere.Décapsuler();
        cinqbiere.Décapsuler();
        System.out.println(uneBiere);
        System.out.println(deuxbiere);
        System.out.println(troisbiere);
        System.out.println(quatrebiere);
        System.out.println(cinqbiere);
    }
    
}
