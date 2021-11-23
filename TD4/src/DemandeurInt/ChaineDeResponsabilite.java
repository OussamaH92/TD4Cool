package DemandeurInt;

import Realisateur.Encodeur;

import java.util.ArrayList;

public abstract class ChaineDeResponsabilite implements Commande{

    protected Encodeur realisateur;
    protected ChaineDeResponsabilite cr;

    public ChaineDeResponsabilite(Encodeur realisateur) {
        this.realisateur = realisateur;
        this.cr = null;
    }


    public ChaineDeResponsabilite(Encodeur realisateur, ChaineDeResponsabilite ch) {
        this.realisateur = realisateur;
        this.cr = ch;
    }

    public abstract String internalExecute(String str);

    @Override
    public String execute(String str) {


        String res = str;
        res = this.internalExecute(res);

        if(this.cr != null){
            res = cr.internalExecute(res);
        }

        return res;
    }

}
