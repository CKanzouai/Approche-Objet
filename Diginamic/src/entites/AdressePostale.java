package entites;

public class AdressePostale {
    public int numéroDeRue;
    public String libelléDeLaRue;
    public int codePostal;
    public String ville;


    public AdressePostale(int numéroDeRue, String libelléDeLaRue, int codePostal, String ville) {
        this.numéroDeRue = numéroDeRue;
        this.libelléDeLaRue = libelléDeLaRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public AdressePostale() {

    }
}
