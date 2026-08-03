package Java_Core;
// 29 . vd practice set Arrays
public class Shubham25 {
    public static void main(String[] args) {

        // practice problem 1
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("1.The value of sum is :- " + sum);

        // practice problem 2
        float[] marks1 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1 = 0.44f;
        boolean isInArray = false;
        for (float element1 : marks1) {
            if (sum1 == element1) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("2.The value is present in the array");
        } else {
            System.out.println("2.The value is not present in the array");
        }

        // practice Problem 3
        float[] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum2 = 0;
        for (float element : marks2) {
            sum2 = sum2 + element;
        }
        System.out.println("3.The value of Average marks is :- " + sum2 / marks2.length);

        //  Practice Problem 4
        int[][] mat1 = {{1, 2, 3}
                , {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format("4.Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("5.Addition of matrix : - ");
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }

        // practice problem 5
        //revrse arrays
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int a = Math.floorDiv(l,2);
        int temp ;
        System.out.print("5.Arrays Reverse : - ");
        for (int i=0; i<a;i++){
            // Swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element : arr){

            System.out.print(element + " ");
        }
        System.out.println();

        // practice problem 6
        // find maximum arrays
        int [] arr1 = {1,2100,3,2455,5,34,67};
        int max = Integer.MIN_VALUE;
        for(int element : arr1){
            if(element > max){
                max = element;
            }
        }
        System.out.println("6.The value of the maximum element in this array is :- "+max);

        // Practice Problem 7
        // Minimum Value find
        int [] arr2 = {110,240,345,465,535,99};
        int min = Integer.MAX_VALUE;
        for(int element : arr2){
            if(element < min){
                min = element;
            }
        }
        System.out.println("7.The value of the minimum element in this array is :- "+min);


        // Practice Problem 8
        // Arrays is sorted or not
        System.out.print("8.It's Array is Sorted Or Not :- ");
        boolean isSorted = true;
        int [] arr3  = {1,2,3,4,5};
        for(int i=0;i<arr3.length-1;i++){
            if(arr3[i] > i+1){
                isSorted = false ;
                break;

            }
        }
        if(isSorted){
            System.out.print("The array is sorted");
        }
        else{
            System.out.print("The array is not sorted");
        }
    }
}
