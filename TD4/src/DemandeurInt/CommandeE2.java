package DemandeurInt;

import Realisateur.Encodeur;
import Realisateur.Evenement;

public class CommandeE2 extends ChaineDeResponsabilite{

    public CommandeE2(Encodeur realisateur) {
        super(realisateur);
    }

    public CommandeE2(Encodeur realisateur, ChaineDeResponsabilite cr) {
        super(realisateur, cr);
    }

    @Override
    public String internalExecute(String str){

        String res = str;
        res = realisateur.encode2(str);

        return res;
    }
}
