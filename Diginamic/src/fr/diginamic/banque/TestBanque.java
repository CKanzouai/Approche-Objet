package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(1234567, 32456);
        System.out.println(compte.toString());
        System.out.println("Numéro de compte : " + compte.getNumeroCompte());
        System.out.println("Solde : " + compte.getSolde());
    }
}
