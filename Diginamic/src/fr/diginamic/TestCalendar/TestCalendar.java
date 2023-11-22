package fr.diginamic.TestCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 4, 19, 23, 59, 30);
        Date date1 = calendar.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String Date1 = sdf1.format(date1);
        System.out.println(Date1);
        System.out.println();
        Calendar calendar2 = Calendar.getInstance();
        Date currentDate = calendar2.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String Date2 = sdf2.format(currentDate);
        System.out.println(Date2);
        System.out.println();
        SimpleDateFormat sdfFr = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("fr"));
        String formattedDateFr = sdfFr.format(currentDate);
        System.out.println("français : " + formattedDateFr);
        System.out.println();
        SimpleDateFormat sdfRu = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru"));
        String formattedDateRu = sdfRu.format(currentDate);
        System.out.println("russe : " + formattedDateRu);
        System.out.println();

        SimpleDateFormat sdfCh = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
        String formattedDateCh = sdfCh.format(currentDate);
        System.out.println("Chinois : " + formattedDateCh);

        System.out.println();
        SimpleDateFormat sdfGer = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
        String formattedDateGer = sdfGer.format(currentDate);
        System.out.println("Allmend : " + formattedDateGer);

    }



}
