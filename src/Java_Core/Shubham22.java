package Java_Core;
// 27 . for each loops
public class Shubham22 {
    public static void main(String[] args) {
        // 1 . simple
        System.out.println("Simple Arrays :- ");
        int [] marks = {56,75,45,90,55,56,66};
        float marks1 [] = {98.2f,22.5f,95.3f};
        String Student [] = {"Shubham","Sakshi","Radha"};
        System.out.println(marks.length);
        System.out.println(marks1[2]);
        System.out.println(Student[2]);

        // 2 . All Arrays displaying in (Navie Way)
        System.out.print("All Element print in Arrays :- ");
        int []mark = {45,50,52,70,37,49};
        System.out.println(mark.length);
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);

        // 3 . Smart printed in all element in Arrays
        System.out.println("All element print in Arrays use in for loops :- ");
        String  shubh [] = {"Shubham","Neha","Surya","Chandu","Megha"};
        for(int i=0;i<shubh.length;i++){
            System.out.println(shubh[i]);
        }

        // Quik Quiz  print the Arrays in Reverse order
        System.out.println("Character is a Arrays in Reverse :- ");
        char chart [] = {'A','B','C','D','E','F'};
        for(int i=chart.length-1;i>=0;i--){
            System.out.println(chart[i]);
        }

        // For Each loops in Use
        System.out.println("It's Use in For Each Loops :- ");
        int Sak [] = {74,99,95,15,57,87,67,45,19,81};
        for(int element:Sak){
            System.out.println(element);
        }
    }
}
