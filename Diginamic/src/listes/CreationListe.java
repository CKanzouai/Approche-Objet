package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>();
        for (int i =1; i<101; i++){
            array.add(i);
        }
        System.out.println(array);
        System.out.println(array.size());
    }
}

