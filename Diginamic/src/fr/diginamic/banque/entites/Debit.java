package fr.diginamic.banque.entites;

public class Debit extends Operation{
    @Override
    public String getType() {
        return "Debit";
    }

    @Override
    public double montantGlobal() {
        return (-getMontant());
    }

    public Debit(String dateOp, double montant) {
        super(dateOp, montant);
    }

}
