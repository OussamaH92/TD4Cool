package DemandeurInt;

import Realisateur.Encodeur;
import Realisateur.Evenement;

public class CommandeConversion implements Commande{

    private Encodeur realisateur;


    public CommandeConversion(Encodeur realisateur) {
        this.realisateur = realisateur;

    }


    @Override
    public String execute(String str) {

        return realisateur.toUppercase(str);
    }
}
