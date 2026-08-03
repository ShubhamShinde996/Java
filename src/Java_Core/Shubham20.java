package Java_Core;

import java.util.Scanner;

// 25 . chapter 5 Practice set
public class Shubham20 {
    public static void main(String[] args) {

        // 1 . star pattern inverted
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        //  2 . practice problem
        int sum = 0;
        int n=3;
        for(int i=1;i<=n;i++){
            sum=sum+(2*i);
        }
       System.out.print("Sum is even number is : ");
        System.out.println(sum);

        // 3 . practice problem
        System.out.println("Table in 5 :- ");
        int m = 5;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",m,i,m*i);
        }

        // 4 . Practice Problem
        System.out.println("Reverse Tables in 10 :- ");
        int n1 = 10;
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n",n1,i,n1*i);
        }

        // 5 . For Loops Find factorial
        int o = 5;
        long fact = 1;
        for(int i=1;i<=o;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of 5 is :- "+fact);

        // 6 . While loops
        int n2 = 5;
        int factorial = 1;
        int i = 1;
        while(i<=n2){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial of 5 is :- "+factorial);

        // 7 . question one but using while loop
       int Q = 4;
       while(Q>=1){
           int R = Q;
           while(R>=1){
               System.out.print("* ");
               R--;
           }
           System.out.println();
           Q--;
       }

       // 8. For loops in true / false
        System.out.println("It's the For Loop : - ");
        for (int f = 1; f <= 5; f++ ){
            System.out.println(f);
        }

        ///  2 .
        System.out.println("It's the While : - ");
        int f2 = 1;
        while(f2<=5){
            System.out.println(f2);
            f2++;
        }

        // 3 .
        System.out.println("It's the Do-While Loop : - ");
        int f3 = 1;
        do{
            System.out.println(i);
            f3++;
        }while(f3<=5);


        // 9 . 8 table sum karna hain
        System.out.print(" Eight Table ki Sum :- ");
        int N = 8;
        int kum = 0;
        for(int s=1;s<=10;s++){
            kum += N*s;
        }
        System.out.println(kum);

        // 10 do while
        // at leate one
    }
}
