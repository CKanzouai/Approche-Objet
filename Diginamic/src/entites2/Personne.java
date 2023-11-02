package entites2;

import entites.AdressePostale;

import java.util.Scanner;

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
    public void afficherPersonne(){
        System.out.println("prénom " + prénom + " NOM " + nom.toUpperCase());
    }
    public void modifierNom(String nvNom){

        nom = nvNom;
        System.out.println("voici le nouveau nom " + nvNom);

    }
    public void modifierAdresse(AdressePostale nvAdresse){
        adressePostale = nvAdresse;
        System.out.println("voici la nouvelle addresse"+ nvAdresse);

    }
    public String returnNom(){
        return nom;
    }
    public String returnPrenom(){
        return prénom;
    }
    public AdressePostale returnAP(){
        return adressePostale;
    }
}
