/*
 * TP3 ex1
 * 23/10/2024
 */
package tp3_heroic_fantasy_cavallo;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author ethan
 */
public class TP3_Heroic_Fantasy_CAVALLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Epee katana = new Epee("Katana", 5, 9);

        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        Baton saule = new Baton("Saule", 6, 7);

        // Création d'un tableau dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des épées et des bâtons dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques des armes en parcourant le tableau
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));  // Utilisation de toString
        }

        // Création des personnages (Magiciens et Guerriers)
        Magicien gandalf = new Magicien("Gandalf", 65, true);  // confirmé
        Magicien garcimore = new Magicien("Garcimore", 44, false);  // novice

        Guerrier conan = new Guerrier("Conan", 78, false);  // à pied
        Guerrier lannister = new Guerrier("Lannister", 45, true);  // à cheval

        // Création d'un tableau dynamique pour stocker les personnages
        ArrayList<Personnage> personnages = new ArrayList<>();

        // Ajout des magiciens et guerriers dans le tableau dynamique
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        // Affichage des caractéristiques des personnages en parcourant le tableau
        for (Personnage personnage : personnages) {
            System.out.println(personnage);  // Utilisation de toString
        }

        // Ajout des armes à l'inventaire de Conan
        conan.ajouterArme(chene);
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);

        // Équipement de Conan avec la première épée "Excalibur"
        conan.equiperArme("Excalibur");

        // Ajout des armes à l'inventaire de Gandalf
        gandalf.ajouterArme(charme);
        gandalf.ajouterArme(saule);
        gandalf.ajouterArme(katana);

        // Affichage du nombre d'armes préférées (bâtons) de Gandalf
        System.out.println("Le magicien " + gandalf.getNom() + " possède " + gandalf.compterArmesPredilection() + " bâtons.");

        // Affichage des informations des personnages (avec armes équipées)
        System.out.println(conan);
        System.out.println(gandalf);
        
        System.out.println("\nNombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers : " + Guerrier.getNbGuerriers());
        System.out.println("Nombre total de magiciens : " + Magicien.getNbMagiciens());
        
        // 54.

        System.out.println("\n\n\n\nCaractéristiques des personnages créés :");
        System.out.println(conan);
        System.out.println(gandalf);

        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre de guerriers : " + Guerrier.getNbGuerriers());
        System.out.println("Nombre de magiciens : " + Magicien.getNbMagiciens());

        // 55. Fatiguez le guerrier.
        conan.seFatiguer();

        // 56. Afficher toutes les caractéristiques du guerrier et vérifier (par un message) s'il est toujours vivant.
        System.out.println("Caractéristiques de Conan après s'être fatigué :");
        System.out.println(conan);
        System.out.println("Conan est toujours vivant : " + (conan.estVivant() ? "Oui" : "Non"));

        // 57. Faire en sorte que le magicien soit victime d'une attaque de la part du guerrier et afficher leurs caractéristiques.
        conan.attaquer(gandalf);

        System.out.println("Caractéristiques après l'attaque de Conan sur Gandalf :");
        System.out.println(conan);
        System.out.println(gandalf+"\n\n");
        
        // Étapes 59 & 60 : Création des armes ( déjà fait )

        // Étapes 61 & 62 : Création d'un magicien non confirmé et d'un guerrier à cheval
        Magicien magicien = new Magicien("Merlin", 50, false); // non confirmé
        Guerrier guerrier = new Guerrier("Arthur", 70, true); // à cheval

        // Attribution d'une épée et d'un bâton à chacun
        magicien.ajouterArme(excalibur);
        magicien.ajouterArme(chene);
        
        guerrier.ajouterArme(durandal);
        guerrier.ajouterArme(charme);

        // Étape 63 : Choix d'une arme pour chaque personnage
        magicien.equiperArme("Excalibur"); // Le magicien utilise l'épée "Excalibur"
        guerrier.equiperArme("Durandal");  // Le guerrier utilise l'épée "Durandal"

        // Étape 64 : Le magicien attaque le guerrier
        magicien.attaquer(guerrier);

        // Affichage des caractéristiques après l'attaque du magicien
        System.out.println(magicien);
        System.out.println(guerrier);

        // Étape 65 : Le guerrier attaque le magicien
        guerrier.attaquer(magicien);

        // Affichage des caractéristiques après l'attaque du guerrier
        System.out.println(magicien);
        System.out.println(guerrier);

        // Étape 66 : Test si les personnages sont vivants
        System.out.println("Le magicien est-il vivant ? " + (magicien.estVivant() ? "Oui" : "Non"));
        System.out.println("Le guerrier est-il vivant ? " + (guerrier.estVivant() ? "Oui" : "Non"));
    }
    
}
