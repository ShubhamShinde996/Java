package Java_Core;
// 6. Exercise 1.1 : - percentages calculates
import java.util.Scanner;
public class Shubham4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Physics Marks : ");
        int physics =  sc.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Biology Marks : ");
        int Biology = sc.nextInt();
        System.out.print("Enter Marathi Marks : ");
        int Marathi = sc.nextInt();
        System.out.print("Enter English Marks : ");
        int English = sc.nextInt();

        int sum =  physics + chemistry + Biology + Marathi + English;
        double percentage = (sum / 500.0) * 100 ;
        System.out.println("Total Marks = " + sum);
        System.out.println("percentage = " + percentage +"%");

    }
}
