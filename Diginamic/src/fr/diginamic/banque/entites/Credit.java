package fr.diginamic.banque.entites;

public class Credit extends Operation{

    @Override
    public String getType() {
        return "Credit";
    }

    @Override
    public double montantGlobal() {
        return getMontant();
    }

    public Credit(String dateOp, double montant) {
        super(dateOp, montant);
    }

}
