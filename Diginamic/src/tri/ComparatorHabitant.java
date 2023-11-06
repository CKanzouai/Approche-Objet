package tri;



import java.util.Comparator;

    public class ComparatorHabitant implements Comparator<Villes> {

        @Override
        public int compare(Villes v1, Villes v2) {
            if (v1.getNbHabitants() > v2.getNbHabitants()){
                return -1; // Ville passé en paramètre + grande que this
            }
            else if (v1.getNbHabitants() < v2.getNbHabitants()){
                return 1;
            }
            return 0;
        }
    }

