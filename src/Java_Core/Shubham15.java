package Java_Core;

import java.util.Scanner;

// vd . 19 Practice Question Conditional And Switch Case
public class Shubham15 {
    public static void main(String[] args) {

//        // 1 . condtional
//        int a = 10;
//        if(a==11){ // add == if condtion in value assign hot nhi
//            System.out.println("I am 11 !");
//        }
//        else{
//            System.out.println("I am not 11 !");
//        }
//
//        // 2 . Question
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks Physics :- ");
//        byte phy =  sc.nextByte();
//        System.out.println("Enter your marks Chemistry :- ");
//        byte ch = sc.nextByte();
//        System.out.println("Enter your marks Maths :- ");
//        byte math = sc.nextByte();
//
//        float avg = (phy+ch+math)/3.0f;
//        System.out.println("Your Overall percentage is :- "+avg);
//        if(avg>=40 && phy>=33 && ch>=33 && math>=33){
//            System.out.println("Congratulations! You are a Promoted!");
//        }
//        else {
//            System.out.println("Sorry, you are not a Promoted! Please try again!");
//        }

        // 3 . Question : - income tax calulate
//        Scanner sc = new Scanner(System.in);
//            System.out.println("Enter your marks income per lakhs annum : - ");
//            float tax = 0;
//            float income = sc.nextFloat();
//            if(income<=2.5){
//                tax = tax + 0;
//            }
//            else if(income>2.5f && income <= 5f){
//                tax = tax + 0.05f * (income-2.5f);
//
//            }
//            else if(income>5f && income <= 10f){
//                tax = tax + 0.05f * (5.0f-2.5f);
//                tax = tax + 0.2f * (income-2.5f);
//            }
//            else if(income>10.0f){
//                tax = tax + 0.05f * (5.0f-2.5f);
//                tax = tax + 0.05f * (10.0f-5f);
//                tax = tax + 0.03f * (income-2.5f);
//            }
//            System.out.println("The total tax paid by the employee is :" + tax);


            // 4 . Questions : - day
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your number : ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Invalid day");
//        }

              // 5 . leap year in
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Year : - ");
//        int year = sc.nextInt();
//
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println("This is Leap Year");
//        }
//        else{
//            System.out.println("This is not Leap Year");
//        }

        // 6 . find web site
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Website : ");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is organizational website");
        }
        else if (website.endsWith(".com")) {
            System.out.println("This is commercial website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("This is indian website");
        }
    }

}


