package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {









    public static void Date_Convert() throws ParseException {
        String pattern = "dd mm yyyy HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);


        String sDate1="31 12 1998 12:00";
        Date simpleDateFormat1 = new SimpleDateFormat(pattern).parse(sDate1);
        date = simpleDateFormat.format(simpleDateFormat1);
        System.out.println(date);

        System.out.println(simpleDateFormat1.compareTo(simpleDateFormat1));
}

}
