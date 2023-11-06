package tri;


import java.util.Comparator;
import java.util.List;

public class Villes implements Comparable<Villes> {
    private String nom;
    private double nbHabitants;

    public Villes(String nom, double nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public Villes(List<Villes> villes) {
    }

    public String getNom() {
        return nom;
    }

    public double getNbHabitants() {
        return nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(double nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    /**
     *
      * @param    @Override
     *     public int compareTo(Villes autre) {
     *        int resultat = this.nom.compareTo(autre.getNom());
     *     return resultat;
     *     } autre the object to be compared.
     * @return
     */


    public int compareTo(Villes autre) {
        if (this.nbHabitants > autre.getNbHabitants()){
            return 1;
        }
        if (this.nbHabitants < autre.getNbHabitants()){
            return -1;
        }
        return 0;
    }



}
