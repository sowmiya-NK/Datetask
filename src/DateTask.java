import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

public class DateTask {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        //addday
        SimpleDateFormat dd = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();//create instance calender has abstract class so we create a instance method
        cal.add(Calendar.DATE, -10);
        String result = dd.format(cal.getTime());
        System.out.println("date " + result);

        //addMonth
        SimpleDateFormat mm = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 10);
        String res = mm.format(calendar.getTime());
        System.out.println("Month " + res);

        //change format 29/10/2023 ->29.10.2023
        SimpleDateFormat changeformat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("change date format(30/10/2023) -> " + changeformat.format(date));

        //subtract the date
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2023, Calendar.OCTOBER, 30);
        cal2.set(2023, Calendar.OCTOBER, 20);
        long differenceDate = (cal1.getTimeInMillis() - cal2.getTimeInMillis())/(24*60*60*1000);//Milliseconds in a Second=1000
        System.out.println("difference between two dates :  " + differenceDate);


        //equal two dates
        Date d1=new Date();
        Date d2=new Date();
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("dd.MM.yyyy");

        String set1=simpleDateFormat1.format(d1);
        String set2=simpleDateFormat2.format(d2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.equals(set2));//false
        System.out.println(set1.compareTo(set2));//1


    }

}
