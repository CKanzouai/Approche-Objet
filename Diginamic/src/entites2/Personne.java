package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prénom;
    public AdressePostale adressePostale;


    public Personne(String nom, String prénom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prénom = prénom;
        this.adressePostale = adressePostale;
    }

    public Personne() {

    }
}
