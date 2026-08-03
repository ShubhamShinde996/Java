package Java_Core;

public class Shubham28 {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a ,int b ,int c){
//        return a+b+c;
//    }
//    static int sum(int a ,int b ,int c,int d){
//        return a+b+c+d;
//    }
    static int sum (int ...arr){
        int result = 0;
        for(int a :arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("** Welcome to Varargs Tutorial **");
        System.out.println("The sum of Nothing is: "+ sum());
        System.out.println("The sum of 1 is: "+ sum(1));
        System.out.println("The sum of  5 and 9 is : "+sum(5,9));
        System.out.println("The sum of 5 , 4 and 9 is : "+sum(5,4,9));
        System.out.println("The sum of 5 , 4 and 9 , 4 is : "+sum(5,4,9,4));
    }
}
