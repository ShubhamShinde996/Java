package Java_Core;
// 5. getting User input
import java.util.Scanner;
public class Shubham3 {
    public static void main(String[] args) {
        System.out.println("Taking Input From the user ");
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = Sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = Sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is : " + sum);

        // float
        float a = Sc.nextFloat();
        float b = Sc.nextFloat();
        System.out.println(a+b);


        // boolean // checking the number int or float
//        boolean b1 = Sc.hasNextFloat();
//        System.out.println(b1);

        // String
        String c1 = Sc.next(); // one sentences only on first letter read
        System.out.println(c1);
        String c2 = Sc.nextLine(); // complete sentences in read
        System.out.println(c2);
    }
}
