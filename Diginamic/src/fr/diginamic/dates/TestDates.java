package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String Date = sdf.format(date);
       // System.out.println(date);
        System.out.println(Date);
        System.out.println();

        Date date1 = new Date(116, 4,19,23,59, 30);
        //System.out.println(date1);
        SimpleDateFormat std1 = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        String Date1 =std1.format(date1);
        System.out.println(Date1);
        System.out.println();
        SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss", Locale.FRANCE);
        System.out.println(formateur.format(new Date()));




        /**
         *         System.out.println();
         *         Date date1 = new Date(120, 6,7,12,25, 30);
         *         System.out.println(date1);
         *         //System.out.println(date);
         *
         *         System.out.println(        );
         *         Calendar calendar = Calendar.getInstance();
         *         calendar.set(2020, 6,7,19,30,56);
         *         Date date2 = calendar.getTime();
         *         System.out.println(date2);
          */

    }
}
