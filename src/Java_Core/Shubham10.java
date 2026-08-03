package Java_Core;
// 13. Introduction to String

import java.util.Scanner;

public class Shubham10 {
    public static void main(String[] args) {

       // String name = new String("Shubham");
       String name = "Shubham";
        System.out.print("The name is ");
        System.out.println(name);

        // 2 problem  printF
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f",a ,b);

        // 3. String (sc.next) VS (sc.nextLine)
        Scanner sc = new Scanner(System.in);
       // String s = sc.next(); //  only first name read spaces outsides not read

        // sentences print
        String s = sc.nextLine();
        System.out.println(s);

        // lenth for String
        String good = "Shubham";
        System.out.println(good.length());
    }
}
