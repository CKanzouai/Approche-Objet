package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 54400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 97000));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));


        Ville villePlusPeuple = villes.get(0);

        // System.out.println());
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() > villePlusPeuple.getNbHabitants()) {
                villePlusPeuple = villes.get(i);
            }
        }
        System.out.println("la ville la plus peuplée est " + villePlusPeuple.getNom() + " Avec " + villePlusPeuple.getNbHabitants() + " Habitants");

        double min = villes.get(0).getNbHabitants();

        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() < min) {
                min = villes.get(i).getNbHabitants();
            }
        }
        //System.out.println(min);

        Iterator<Ville> iter = villes.iterator();
        while (iter.hasNext()) {
            Ville ville = iter.next();
            if (ville.getNbHabitants() == min) {
                iter.remove();
            }
        }

        System.out.println("la liste des villes restantes est : ");

        for (int i = 0; i < villes.size(); i++) {

            System.out.println("- " + villes.get(i).getNom() + ", " + villes.get(i).getNbHabitants());

        }


        //Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        System.out.println("les villes qui ont plus de 100000 sont : ");
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() > 100000) {
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
                System.out.println("- " + villes.get(i).getNom() + ", " +villes.get(i).getNbHabitants());

            }



        }


    }
}

