package Java_Core;
// 102 . Advanced Java Practice Set

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Shubham83 {
    public static void main(String[] args) {
        // Practice Problem 1
        System.out.println("ArrayList : ");
        ArrayList ar  =  new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        ar.add("Student 11");

        for(Object o : ar) {
            System.out.println(o);
        }

        // Practice Problem 2
        System.out.println("Date : ");
        Date d =  new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // Practice Problem 3
        System.out.println("Calendar : ");
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +  ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // Practice Problem 4
        System.out.println("LocalDateTime : ");
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd --E H:m a HH:mm:ss");
        String myDate = dt.format(dtf);
        System.out.println(myDate);


    // Practice Problem 5
        System.out.println("HashSet : ");
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);


    }
}
