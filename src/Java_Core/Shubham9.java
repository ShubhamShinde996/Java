package Java_Core;

import java.util.Scanner;

// 12 vd  Chapter 2 .: Practice Set
public class Shubham9 {
    public static void main(String[] args) {

        // 1.Questions
        float a = 7/4f * 9/2f;
        System.out.println(a);

        // 2. Questions
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);

        // 3. Questions
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        System.out.println(a>8);

        // 4 Questions
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Initial Velocity (u) : ");
        double u = sc1.nextDouble();
        System.out.println("Enter Acceleration (a) : ");
        double u1 = sc1.nextDouble();
        System.out.println("Enter Distance (s) : ");
        double s = sc1.nextDouble();
        double vSquare = (u * u) + (2 * u1 * s);
        double v = Math.sqrt(vSquare);

        System.out.println("Final velocity (v) = " + v);


        // 5 Questions
        int shubh = sc.nextInt();
        System.out.println(shubh>12);
        System.out.println(7*49/7+35/7);
    }
}
