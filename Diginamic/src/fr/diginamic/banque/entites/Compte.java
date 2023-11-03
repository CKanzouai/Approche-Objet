package fr.diginamic.banque.entites;

public class Compte {


    private int numeroCompte;
    private int  solde;

    public Compte(int numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }
    public int getNumeroCompte() {
        return numeroCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numeroCompte +
                ", solde=" + solde +
                ' ';
    }
}