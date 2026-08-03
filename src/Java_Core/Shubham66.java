package Java_Core;

import java.sql.SQLOutput;
import java.util.Scanner;

// 81 . Handling Specific Exceptions in Java
public class Shubham66 {
    public static void main(String[] args) {
      int [] marks = new int[3];
      marks[0] = 7;
      marks[1] = 56;
      marks[2] = 6;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("The value of at array index entered is : " + marks[ind]);
            System.out.println("The value of array-value/number is : " + marks[ind]/number);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occured");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occured");
        }
        catch (Exception e) {
            System.out.println("Some other Exeception Occured");
        }
    }
}
