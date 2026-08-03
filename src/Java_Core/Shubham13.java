package Java_Core;

import java.util.Scanner;

// 16 . Conditions
// 17 . Relational And Logical Operators
public class Shubham13 {
    public static void main(String[] args) {

       // 16 . Conditions
        int a = 18;
        if(a==18){
            System.out.println("Yes boy you can drive");
        }
        else{
            System.out.println("No boy you can drive");
        }

        // 1.2 else if
        System.out.print("Enter your Age : - ");
        Scanner sc = new Scanner(System.in);
        int shubh = sc.nextInt();
        if(shubh>56){
            System.out.println("You are experienced!");
        }
        else if (shubh>46){
            System.out.println("You are Semi-experienced!");
        }
        else if (shubh>36){
            System.out.println("You are Semi-Semi-experienced!");
        }
        else{
             System.out.println("You are not experienced!");

        }

        // 17 . Relational And Logical Operators
        // 1 . AND
        System.out.println("For the AND : - ");
        boolean b = true;
        boolean c = false;
        boolean d = false;
        if(b && c && d){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        // 2 . OR
        System.out.println("For the OR : - ");
        boolean e = true;
        boolean f = true;
        boolean g = false;
        if(e || f || g){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        // 3 . NOT
        System.out.println("For the NOT : - ");
        System.out.print("Not(a) is ");
        System.out.println(!b);
        System.out.print("Not (c) is ");
        System.out.println(!c);
    }
}
