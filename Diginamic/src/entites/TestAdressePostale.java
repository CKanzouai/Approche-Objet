package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale aP = new AdressePostale();
        AdressePostale aP2 = new AdressePostale();

        aP.numéroDeRue=230;
        aP.libelléDeLaRue="Avenue de paris";
        aP.codePostal = 71000;
        aP.ville = "chalon sur saone";

        aP2.numéroDeRue=28;
        aP2.libelléDeLaRue="rue de belfort";
        aP2.codePostal = 21000;
        aP2.ville = "Dijon";
        System.out.println(aP2.numéroDeRue);
    }
}
