package Java_Core;

import java.util.Scanner;

// 18 . Switch Case
public class Shubham14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : - ");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;

            case 23:
                System.out.println("You are going to join a job!");
                break;

            case 60:
                System.out.println("You are going to get retrired!");
                break;

            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");

        // char change syntax
        System.out.print("Switch Case using in Char : - ");
        char var = 'r';
        switch (var) {
            case 'r':
                System.out.println("You are going to become an Adult!");
                break;

            case 'x':
                System.out.println("You are going to join a job!");
                break;

            case 'y':
                System.out.println("You are going to get retrired!");
                break;

            default:
                System.out.println("Enjoy your life!");
        }

        // Switch case using in String
        System.out.print("Switch case using in String : - ");
        String name = "Shubham";
        switch (name) {
            case "Akash":
                System.out.println("You are going to become an Adult!");
                break;

            case "rushi":
                System.out.println("You are going to join a job!");
                break;

            case "Shubham":
                System.out.println("You are going to get retrired!");
                break;

            default:
                System.out.println("Enjoy your life!");
        }


        // Enhanced Switch ---> no need in break
        int ana = 21;

        switch(ana){
            case 1 -> System.out.println("I am Shubham!");
            case 2 -> System.out.println("I am Shubh!");
            case 3 -> System.out.println("I am gentleman!");
            case 21 -> System.out.println("I am an Engineer !");
        }


    }
}