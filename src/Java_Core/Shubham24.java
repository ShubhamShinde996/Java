package Java_Core;
import java.util.Collections;
import java.util.Arrays;
// Self Study in Arrays
// Arrays in the all contecpt
public class Shubham24 {
    public static void main(String[] args) {

        // 1 . Array sort
        //Array sort करण्यासाठी.
        System.out.print("1.Array is sorted :- ");
        int [] a = {5,2,9,1,6,4,3,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // 2 . Arrays to.String
       // Array print करण्यासाठी (direct print होत नाही म्हणून).
        System.out.print("2.Arrays is directed Printed :- ");
        int [] a0 = {10,20,30,40};
        System.out.println(Arrays.toString(a0));

        // two arrays is same checking
        //दोन arrays same आहेत का ते check करायला.
        System.out.print("3.Do they have two arrays same to check :- ");
        int []a1 = {1,2,3,4,5};
        int []a2 = {1,2,3,4,6};
        System.out.println(Arrays.equals(a1,a2));

        // 4 . Arrays.fill()
        // सगळ्या elements ला एकच value द्यायला.
        System.out.print("4.All element are put same value :- ");
        int [] a3 = new int[5];
        Arrays.fill(a3,10);
        System.out.println(Arrays.toString(a3));

        // 5 . Arrays.copyOf
        // Array copy करून नवीन array तयार करायला.
        System.out.print("5.Old Arry copy and new Array created :- ");
        int [] a4 = {1,2,3,};
        int [] a5 = Arrays.copyOf(a4,5);
        System.out.println(Arrays.toString(a5));

        // 6 . Arrays.copyOfRange()
        // Array चा specific part copy करायला.
        System.out.print("6.Array is specific part printed :- ");
        int [] a6 = {10,20,30,40,50};
        int [] a7 = Arrays.copyOfRange(a6,1,4);
        System.out.println(Arrays.toString(a7));

        // 7 . Arrays.binarySearch()
        // Sorted array मध्ये element शोधायला.
        // ⚠️ Array आधी sort केलेला असला पाहिजे.
        System.out.print("7.Arrays in find one element :- ");
        int [] a8 = {19,45,67,81,87};
        int index = Arrays.binarySearch(a8,81);
        System.out.println(index);

        // 8 . Arrays.asList()
        // Array ला List मध्ये convert करायला (Objects साठी).
        System.out.print("8.Arrays Converted to List :- ");
        String [] names = {"Ram","Shyam","Amit","Rushi","Shubham"};
        System.out.println(Arrays.asList(names));


        // Simple Array in sorted : - Part II

        System.out.println("Arrays in PART-II :-");

        // 1 . Ascending Order Sort
        System.out.print("1.Ascending Order Sort :- ");
        int b[] = {5, 2, 9, 1};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        // 2 . Descending Order Sort
        // Primitive array direct reverse sort होत नाही, trick वापरतो 👇
        System.out.print("2.Descending Order Sort :- ");
        Integer [] b1 = {5,2,9,1};
        Arrays.sort(b1, Collections.reverseOrder());
        System.out.println(Arrays.toString(b1));

        // 3 . Partial Sorting (Range)
        System.out.print("3.Partial Order Sorting :- ");
        int [] b2 = {9,7,5,3,1};
        Arrays.sort(b2,1,4);
        System.out.println(Arrays.toString(b2));

        // 4 . Parallelsort()
        System.out.print("4.Parallel Sorting :- ");
        int [] b3 = {9,7,5,3,1};
        Arrays.parallelSort(b3);
        System.out.println(Arrays.toString(b3));

        // 5 . Check Array is sorted or not
        System.out.print("5.Check This Arrays sorted or Not :- ");
        int [] b4 = {22,56,64,74,88,89,100};
        boolean sorted = true;
        for(int i=0;i<b4.length-1;i++){
            if(b4[i]>b4[i+1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);

        // 6 . Binary Search on sorted Array
        // Only works on sorted arrays.
        System.out.print("6.Binary search on sorted array :- ");
        int [] b5 = {1,3,5,7,9,11,13};
        int index1 = Arrays.binarySearch(b5,9);
        System.out.println(index1);

        // 7 . sort 2D Array(Row-Wise)
        System.out.print("7.There are 2-Dimensional Arrays sorted :- ");
        int [] [] b6 = {
                {3,1,2},
                {9,5,7}
        } ;
        for(int i=0;i<b6.length;i++){
            Arrays.sort(b6[i]);
        }
        System.out.println(Arrays.deepToString(b6));


        // PART -- III
        System.out.println("Advanced Arrays in the PART-III :-");

        // 1. Parallelsort()
        //  Multi-threading वापरून sort करतो (Java 8+).
        System.out.print("1.Parallel Sorting :- ");
        int [] c = {9,5,1,7,3};
        Arrays.parallelSort(c);
        System.out.println(Arrays.toString(c));


        // 2 . deepToString()
        // Normal toString() 2D array नीट print करत नाही.
        System.out.print("2.2D arrays in printed :- ");
        int [] [] c1 = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(c1));

        // 3 . deepEquals()
        System.out.print("3.Two Dimensional Arrays cheking in same or not :- ");
        int [] [] c2 = {{1,2},{3,4}};
        int [] [] c3 = {{1,2},{3,4}};
        System.out.println(Arrays.deepEquals(c2,c3));

        // 4 . SetAll
        /*index 0 → 0 * 0 = 0
        index 1 → 1 * 1 = 1
        index 2 → 2 * 2 = 4
        index 3 → 3 * 3 = 9
        index 4 → 4 * 4 = 16*/
        // Lambda वापरून values assign.
        System.out.print("4.SetAll Use :- ");
        int [] c4 = new int [5];
        Arrays.setAll(c4, i -> i * i);
        System.out.println(Arrays.toString(c4));

        // 5. parallelSetAll()
        // Large arrays साठी.
        System.out.print("5.ParallelSetAll in Use Big Arrays :- ");
        int [] c5 = new int [10];
        Arrays.setAll(c5, i -> i * 10);
        System.out.println(Arrays.toString(c5));

        // 6.stream() – Array → Stream (Advanced🔥)
        // Functional programming + Java 8+
        System.out.print("6.All element's in arrays Additions :- ");
        int [] c6 = {1,2,3,4,5,};
        int sum = Arrays.stream(c6).sum();
        System.out.println(sum);

        // 7 . mismatch()
        System.out.print("7.Mismatch two are show :- ");
        int [] c7 = {1,2,3};
        int [] c8 = {1,2,4};
        System.out.println(Arrays.mismatch(c7,c8));


    }
}
