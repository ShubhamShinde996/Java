package Java_Core;

import java.sql.SQLOutput;

// 35 . Java Tutorial : Practice Problem
public class Shubham30 {
    // 1.Practice Problem
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    // 2 . Practice Problem
        static void patternOne(int m){
            for(int i=0;i<=m;i++){
               for(int j=0;j<=i+1;j++){
                   System.out.print("* ");
               }
               System.out.println("");
            }
    }
    // 3.Practice Problem
    static int sumRec(int o){
        // Base Condition
        if(o==1){
            return 1 ;
        }
        return o + sumRec(o-1);
    }
    // 4.Practice Problem : - Star pattern inverted
    static void patternTwo(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    // 5.Practice Problem
    static int fibonacci(int n){
       /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    // 6 . Practice Problem : - Set of Average Number
    static double Average(int numbers[]){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return (double) sum / numbers.length;
    }
    // 7 . Practice Problem
    static void patternRecursion(int n){
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        patternRecursion(n-1);
    }
    // 8 . Practice Problem : - Recursion
    static void patternStar(int n){
        if(n==0){
            return;
        }
        patternStar(n-1);

        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    // 9 . Practice Problem
    static double convert(double celsius){
        return (celsius * 9 / 5)+32;
    }


    public static void main(String[] args) {
        // 1.Practice Problem
        System.out.println("1.Multiplication In Any Number : - ");
        multiplication(10);
        // 2.Practice Problem
        System.out.println("2.Star Pattern : - ");
        patternOne(10);
        // 3.Practice Problem
        System.out.println("3.Sum Of Addition : - ");
        int c = sumRec(4);
        System.out.println(c);
        // 4.Practice Problem
        System.out.println("4.Star Pattern Inverted : - ");
        patternTwo(5);
        // 5.Practice Problem : - Using Recursion Fibbonacci Series
        System.out.print("5.Fibonacci Series : - ");
        int Result = fibonacci(5);
        System.out.println(Result);
        // 6 . Practice Problem :- Average Number
        int arr [] = {10,20,30,40};
        System.out.println("6.Average Number : - " + Average(arr));
        // 7 . Practice Problem : - Star pattern Inverted using Recursion
        System.out.println("7.Star Pattern Inverted in using Recursion: - ");
        patternRecursion(7);
        // 8 . Practice Problem : - Star pattern in Recursion
        System.out.println("8.Star Pattern Inverted in using Recursion: - ");
        patternStar(8);
        // 9 . Practice Problem : - convert to fahrenheit
        double celsius = 25;
        double f =  convert(celsius);
        System.out.println("9. → Celsius → Fahrenheit Convert : - " + f);



    }
}
