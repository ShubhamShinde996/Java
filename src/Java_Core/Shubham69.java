package Java_Core;
// 84 . Throw vs throws in Java
class NegativeRadiusException extends Exception {
      public String toString(){
          return "Radius cannot be negative";
      }
      public String getMessage(){
          return "Radius cannot be negative";
      }
}
public class Shubham69 {
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b)throws ArithmeticException{
        // Made by Harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Shubham
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println("Area is " + ar);
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
    }
}
