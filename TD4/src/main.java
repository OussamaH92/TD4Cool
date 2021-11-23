import Demande.Demandeur;
import DemandeurInt.*;
import Realisateur.Encodeur;
import Realisateur.Evenement;

public class main {

    public static void main(String[] args) {

        String s = "Un premier message.";
        Encodeur encodeur = new Encodeur();

        Demandeur ms = new Demandeur();
        ms.ajouterCommande(new CommandeConversion(encodeur));
        ChaineDeResponsabilite c1 = new CommandeE2(encodeur);
        ChaineDeResponsabilite c2 = new CommandeE1(encodeur,new Evenement('&', 3) ,c1);
        ChaineDeResponsabilite c3 = new CommandeE1(encodeur,new Evenement('=', 4) ,c2);
        ms.ajouterCommande(c3);

        System.out.println(s + " -> " + ms.realiserCommande(s));

    }

}
