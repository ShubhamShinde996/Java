package Java_Core;
// 31.Java in Methods
public class Shubham26 {
    static int logic (int x, int y){// methods in java
       int z ;
       if(x>y){
         z = x+y;
       }
       else{
           z = (x+y)*5;
       }
       return z;
    }
    public static void main(String[] args) {

        int a = 5 ;
        int b = 7 ;
        int c = logic (a,b);
        System.out.println(a + " " + b);
        int a1 = 2;
        int b1 = 1;
        int c1 = logic (a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
