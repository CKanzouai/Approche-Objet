package listes;

public class Ville {
    private String nom;
    private double nbHabitants;

    public Ville(String nom, double nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
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
}
