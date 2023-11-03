package fr.diginamic.banque.entites;

public class CompteTaux  extends Compte{



    private double tauxRemuneration;
    public CompteTaux(int numeroCompte, int solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", taux de remuneration=" + tauxRemuneration +
                '}';
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
