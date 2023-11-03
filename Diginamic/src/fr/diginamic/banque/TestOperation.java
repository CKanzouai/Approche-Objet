package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Credit credit1 = new Credit("12/12/2016", 4567.50);
        Credit credit2 = new Credit("03/02/2021", 500);
        Debit debit1 = new Debit("24/09/2020", 1260.90);
        Debit debit2 = new Debit("04/01/2023", 60.50);
        double montantGlobal=0;

        System.out.println();


        Operation[] operations = new Operation[4];
        operations[0] = credit1;
        operations[1] = credit2;
        operations[2] = debit1;
        operations[3] = debit2;
        for (Operation operation : operations){
            System.out.println(operation.getType() + ", " + operation.getDateOp()+", "+ operation.getMontant());
            System.out.println();
          //  System.out.println(operation);
            montantGlobal += operation.montantGlobal();


        }
        System.out.println("le montant global de toutes les opérations est : " + montantGlobal);


    }
}
