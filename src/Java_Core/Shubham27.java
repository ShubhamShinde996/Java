package Java_Core;

import java.sql.SQLOutput;

// 32 . Method Overloading in java
public class Shubham27 {
    static void Change(int a){
            a=98;
    }
    static void Change2(int [] arr){
        arr[0]=98;
    }
    static void tellJoke(){
        System.out.println("1.I invented a new word!\n" + "Plagiarisa!");
    }
    // Method OverLoading
    static void foo(){
        System.out.println("Good Morning Bro...!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a +" Bro...!");
    }
    static void foo(int b, int c){
        System.out.println("Good Morning " + b + " " + c + " Bro...!");
    }

    public static void main(String[] args) {
        // Case 1 : - Methods calling
        tellJoke();
        // Case 2 : - Changing the Integer
        int [] marks = {60,73,77,89,98,94};
        int x = 45;
        Change(x);
        System.out.println("2.The value of X after running is : - " + x);

        //Case 3
        int [] marks1 = {60,73,77,89,98,94};
        Change2(marks1);
        System.out.println("3.The value of X after running is : - " + marks1[0]);


        // Method OverLoading
        System.out.println("PART-II :- Method Overloading");
        foo();
        foo(60);
        foo(42,22);
        // Argument are actual !

    }
}
