package Java_Core;
// 10. Data Type OF Expressions & Increment / Decrement operators
public class Shubham8 {
    public static void main(String[] args) {
     byte x = 5;
     int y = 6;
     short z = 7;
     int a = y+z;
     float b = 6.54f + x;
        System.out.println(b);


     // Increment And Decrement Operators
     int i = 56;
     // int b = i++; // first b is assigned i (56) then i is increment
        int j = 67;
        int c = ++j; // first j is increment then c is assigned j (68)
        System.out.println(i++); // pahile use karne phir increment karen
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // Quick Quiz
        int r = 7 ;
        System.out.println( ++r *8);

        char ch = 'A';
        System.out.println( ++ch);

    }
}
