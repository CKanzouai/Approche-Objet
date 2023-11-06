package tri;

import listes.Ville;

import java.util.*;


public class TestVille {
    public static void main(String[] args) {
        List<Villes> villes = new ArrayList<>();
        villes.add(new Villes("Nice", 343000));
        villes.add(new Villes("Carcassonne", 47800));
        villes.add(new Villes("Narbonne", 54400));
        villes.add(new Villes("Lyon", 484000));
        villes.add(new Villes("Foix", 97000));
        villes.add(new Villes("Pau", 77200));
        villes.add(new Villes("Marseille", 850700));
        villes.add(new Villes("Tarbes", 40600));

        Collections.sort(villes);
        for (Villes ville : villes){
            System.out.println(ville.getNbHabitants());
        }

        System.out.println();
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println();
        for (Villes v: villes){
            System.out.println(v.getNbHabitants());
        }

        System.out.println();
        Collections.sort(villes, new ComparatorNom());
        System.out.println();

        for (Villes v: villes){
            System.out.println(v.getNom());
        }


        System.out.println();
        Collections.sort(villes, Comparator.comparing(Villes::getNbHabitants));
        System.out.println();
        Collections.sort(villes, Comparator.comparing(Villes::getNom));

    }

}
