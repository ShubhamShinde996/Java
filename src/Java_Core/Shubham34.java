package Java_Core;
// 41 . Java Tutorial : - Exercise 2 : - Solution and shoutouts

import java.util.Random;
import java.util.Scanner;

public class Shubham34 {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 For Rock,1 For Paper,2 For Scissors : ");
        int user =  sc.nextInt();

        Random rand = new Random();
        int Computer = rand.nextInt(3);
        if(user==Computer){
            System.out.println("Draw");
        }
        else if(user==0 && Computer==2 || user==1 && Computer==0 || user==2 && Computer==1){
            System.out.println("You Win...!");
        }
        else{
            System.out.println("Computer Win...");
        }
        System.out.println("Computer Choice : " +  Computer);
    }
}
