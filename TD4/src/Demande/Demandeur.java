package Demande;

import DemandeurInt.Commande;

import java.util.ArrayList;

public class Demandeur {

    private ArrayList<Commande> commandes;

    public Demandeur() {
        this.commandes = new ArrayList<>();
    }

    public void ajouterCommande(Commande c){
        this.commandes.add(c);
    }

    public String realiserCommande(String str){

        String res = str;

        for(Commande c : commandes){
           res = c.execute(res);
        }

        return res;

    }
}
