package Java_Core;

import java.sql.SQLOutput;

// vd . 23 for loops
public class Shubham18 {
    public static void main(String[] args) {
        // 1 . simple using for loop
        System.out.println("your Number : - ");
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        // 2 . odd number Printed
        System.out.println("Your Odd Number : - ");
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i+1);
            }
        }

        // 3 . reverse number in the for loop
        System.out.println("Your Reverse Number : -");
        for(int i=5;i>=0;i--){
            System.out.println(i);
        }

    }
}
