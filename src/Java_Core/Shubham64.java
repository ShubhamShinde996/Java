package Java_Core;
// 78 . Error & Exception in Java
// 79 . 1 . Syntax Error ,
//      2.Runtime Error &
//      3.Logical Error In Java (demo)

import java.util.Scanner;

public class Shubham64 {
    public static void main(String[] args) {
        // 1 . Syntax Error
        //int a = 50 Error : No semicolon
        // b = 8; Error : b not declared
        //System.out.println(a);

//        int x = 10;
//        int y = 20;
//        int z = 0111;
//        System.out.println(x+y+z);

        // 3. Logical Error
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1);


        // 2 Runtime Error
            int k ;
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            System.out.println("Integer Part of 1000 divided by k is : "+100/k);


        }
    }
}
