package fr.diginamic.chaines;

public class TestStringBuilde {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            stringBuilder.append(i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé avec StringBuilder : " + (fin - debut) + " millisecondes");

        long debutString = System.currentTimeMillis();

        String result = "";
        for (int i = 1; i <= 100000; i++) {
            result += i;
        }

        System.out.println();
        long finString = System.currentTimeMillis();

        System.out.println("Temps écoulé avec String et concaténation + : " + (finString - debutString) + " millisecondes");
    }
}
