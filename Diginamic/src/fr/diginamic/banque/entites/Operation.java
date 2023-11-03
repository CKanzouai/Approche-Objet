package fr.diginamic.banque.entites;

public abstract class Operation {

    private String dateOp;
    private double montant;
    public abstract String getType();
    public abstract double montantGlobal();

    public Operation(String dateOp, double montant) {
        this.dateOp = dateOp;
        this.montant = montant;
    }



    public void setDateOp(String dateOp) {
        this.dateOp = dateOp;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDateOp() {
        return dateOp;
    }

    public double getMontant() {
        return montant;
    }
}
