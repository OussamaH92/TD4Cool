package DemandeurInt;

import Realisateur.Encodeur;
import Realisateur.Evenement;

public class CommandeE1 extends ChaineDeResponsabilite{


    private Evenement event;

    public CommandeE1(Encodeur realisateur, Evenement event) {
        super(realisateur);
        this.event = event;
    }

    public CommandeE1(Encodeur realisateur, Evenement event,ChaineDeResponsabilite cr) {
        super(realisateur,cr);
        this.event = event;

    }

    @Override
    public String internalExecute(String str){

        String res = str;
        res = realisateur.encode1(str, event.getC(), event.getI());

        return res;
    }




}
