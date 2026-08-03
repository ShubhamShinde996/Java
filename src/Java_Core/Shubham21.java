package Java_Core;
// 26 vd . Arrays
public class Shubham21 {
    public static void main(String[] args) {
        // Claasroom of 500 students - You have to Store marks of these 500 Student
        // you have 2 options
        // 1. Create_500_variable
        // 2. Use Arrays
            // There are three main ways to create an array in java
        // 1 st type declaration
        // { n-1 }
        // 1.Declaration and then memory allocation
        System.out.print("1. First type of declaration Array :- ");
        int [] marks = new int [5];
        marks[0]=96;
        marks[1]=95;
        marks[2]=96;
        marks[3]=95;
        marks[4]=96;
        System.out.println(marks[4]);


        // 2 nd type of declaration
        // 2 . first declaration and second memory allocations after initializations
        System.out.print("2. Second type of declaration Array :- ");
        int [] marks1;
        marks1 = new int [5];
        marks1[0]=961;
        marks1[1]=962;
        marks1[2]=963;
        marks1[3]=964;
        marks1[4]=965;
        System.out.println(marks1[2]);

        // 3 rd type of declaration Arrays
        // Declaretion , memory allocation and initialization together
        System.out.print("3. Third type of declaration Array :- ");
        int [] marks2 = {54,145,144,258,366};
        System.out.println(marks2[2]);

    }
}
