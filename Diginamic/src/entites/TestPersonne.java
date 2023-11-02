package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p = new Personne();
        p.adressePostale = new AdressePostale();

        p.nom ="Kanzouai";
        p.prénom = "Chaimae";
        p.adressePostale.numéroDeRue=230;
        p.adressePostale.libelléDeLaRue="Avenue de paris";
        p.adressePostale.codePostal = 71000;
        p.adressePostale.ville = "chalon sur saone";
        Personne p2 = new Personne();
        p2.adressePostale = new AdressePostale();
        p2.nom ="Bouka";
        p2.prénom = "Yous";
        p2.adressePostale.numéroDeRue=28;
        p2.adressePostale.libelléDeLaRue="rue de belfort";
        p2.adressePostale.codePostal = 21000;
        p2.adressePostale.ville = "Dijon";
        System.out.println(p.adressePostale.codePostal);
    }
}
