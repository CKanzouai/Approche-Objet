package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(-2);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(5);

        int max = arrayList.get(0);
        int min = arrayList.get(0); // Initialisez min avec la première valeur de la liste

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }

        System.out.println();
        System.out.println("La valeur minimale est : " + min);
        System.out.println();

        System.out.println();
        System.out.println(arrayList);

        System.out.println("La taille de la liste est : " + arrayList.size());
        System.out.println("Le plus grand élément est : " + max);

        Iterator<Integer> iter = arrayList.iterator();

        while (iter.hasNext()) {
            int element = iter.next();
            if (element == min) {
                iter.remove();
            }
        }

        System.out.println(arrayList);


        // Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent
        //positifs.
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            if (arrayList.get(i) < 0) {

                arrayList.set(i, -arrayList.get(i));
            }
        }
        System.out.println(arrayList);


    }

}
