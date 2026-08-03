package Java_Core;
// 98 . Calendar class in Java
import java.util.Calendar;
import java.util.TimeZone;

public class Shubham79 {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getCalendarType());
//        System.out.println(cal.getTimeZone());

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone().getID());

    }
}
