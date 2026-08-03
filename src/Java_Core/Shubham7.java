package Java_Core;
// 9 . Associativity of operators
public class Shubham7 {
    public static void main(String[] args) {


        int a = 6*5-34/2;
        // Highest precendence goes to * and /. They are then evaluated on the basis of left to right assciativity
        // = 30-34/2
        // = 30-17
        // = 13
        int b = 6/5-34*2;
        // = 12-34*2
        // = 12-68
        // =-56
        System.out.println(a);
        System.out.println(b);

        // Precedence & Associativity

        // Quick Quiz
        int x = 5;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

        int p = 0;
        int q = 0;
        int r = 10;
        int s = p*p - 4*r*q/(2*r);
        System.out.println(s);
    }
}

