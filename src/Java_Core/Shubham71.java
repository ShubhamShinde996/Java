package Java_Core;

import java.util.Scanner;

// 86 . Practice Set On Error & Exceptions
public class Shubham71 {
    public static void main(String[] args) {

        // Problem 1
//        // 1. Syntax error
//        // int a = 10
//
//        // 2.  Logical Error
//        int age = 70 ;
 //       int year_born = 2000-78;
//        System.out.println(6/0);

        // Problem 2
        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }

        // Problem 3
        boolean flag = true;
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The Value of marks [index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }




    }
}
