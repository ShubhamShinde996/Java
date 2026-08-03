package Java_Core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 101 . DateTimeFormatter in Java
public class Shubham82 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now(); // This is the date
        System.out.println(date);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy --- E H:m a HH:mm:ss"); // This is the format
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myDate = date.format(dtf); // Creating date string using dat and format
        System.out.println(myDate);
    }
}
