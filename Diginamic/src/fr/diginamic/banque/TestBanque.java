package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(1234567, 32456);
        System.out.println(compte.toString());
        System.out.println();
        System.out.println("Numéro de compte : " + compte.getNumeroCompte());
        System.out.println();
        System.out.println("Solde : " + compte.getSolde());
        System.out.println();
        CompteTaux compteTaux = new CompteTaux(1234, 345, 23.5);
        System.out.println();
        System.out.println(compteTaux.toString());
        System.out.println();
        Compte[] tableauCompte = new Compte[2];
        tableauCompte[0] = new Compte(22, 333);
        tableauCompte[1] = new CompteTaux(222,444, 1.2);
        for (int i=0; i< tableauCompte.length; i++ ){
            System.out.println(tableauCompte[i].toString());
            System.out.println();
        }


    }
}
