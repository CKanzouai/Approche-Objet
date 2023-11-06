package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        /**
         * Apprenez à manipuler une liste de chaines de caractères.
         * • Dans le package listes, créez une classe TestListeString exécutable.
         * • Dans cette classe instanciez une ArrayList de String contenant les éléments suivants :
         * o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
         * • Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
         * • Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
         * majuscules.
         * • Supprimez de la liste les villes dont le nom commence par la lettre N.
         * • Affichez la liste résultante
         */

        List<String> listString = new ArrayList<>();
        listString.add("Nice");
        listString.add("Carcassonne");
        listString.add("Narbonne");
        listString.add("Lyon");
        listString.add("Pau");
        listString.add("Marseille");
        listString.add("Tarbes");

        for (int i = 0; i<listString.size(); i++){
            i = Math.max(i, listString.get(i).length());
            System.out.println(i + listString.get(i));
        }


    }
}
