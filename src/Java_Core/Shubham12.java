package Java_Core;

import java.util.Scanner;

// vd 15 . Java practice Questions On String
public class Shubham12 {
    public static void main(String[] args) {

        // 1 . LowerCase in string
        String A = "SAKSHI";
        System.out.println(A.toLowerCase());

        // 2 . replace
        String B = "Bless";
        System.out.println(B.replace("s","k"));

        // 3 . fill name
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        System.out.println("Dear " + C + " Thanks a lot!");

        // 4 . detect spaces double and triple spaces
        String D = "This String contains  double and   triple spaces";
        System.out.println(D.indexOf("  "));
        System.out.println(D.indexOf("   "));

        // 5 . Escape spaces
        String E = "Dear Shubham, \n\tThis Java course nice.\n\tThanks";
        System.out.println(E);
    }
}
