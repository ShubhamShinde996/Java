package Java_Core;
// 96 . Data And Time in Java
// 97 . The Date Class in Java
import java.util.*;
public class Shubham78 {
    public static void main(String[] args) {
        // 96 . Data And Time in Java
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        // 97 . The Date Class in Java
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        // Current Date And Time
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getHours());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
