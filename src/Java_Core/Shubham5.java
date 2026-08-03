package Java_Core;
// 7 . chapter 1 : Practice Set
import java.util.Scanner;
public class Shubham5 {
    public static void main(String[] args) {
       // Question 1
        int a = 10;
        int b = 70;
        int c = 20;
        int sum = a + b + c;
        System.out.println(sum);

        // Question 2
        float sub1 = 45;
        float sub2 = 95;
        float sub3 = 48;
        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.println(cgpa);

        // Question 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name : ");
        String Name =  sc.next();
        System.out.println("Hii " + Name + " have a good day");

        // Question 4 kilometers to miles

        System.out.print("Enter Distance in kilometers : ");
        double distance = sc.nextDouble();
        double miles = (distance * 0.621371);
        System.out.println("Distance in miles is " + miles);

        // Question 5
        System.out.print("Enter Your Number : ");
        System.out.println(sc.hasNextInt());
    }
}
