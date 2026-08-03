package Java_Core;
// 34. Recursion in java
public class Shubham29 {
    // factorial (0) = 1
    // factorial (n) = n * n-1 *....1
    // factorial (5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial (n) = n * factorial(n-1)

    // 1 . Simple Recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        // 2. Iterative factorial
        static int factorial_iterative ( int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    product *= i;
                }
                return product;
            }
        }
            // 3. Practice Problem
            // Fibbonaci series
            static int fibonacci (int shu){
             if(shu<=1){
                 return shu;
             }
             return fibonacci(shu-1) + fibonacci(shu-2);
            }

    public static void main(String[] args) {
        // 1 . Recursion
        int x = 5;
        System.out.println("1.The factorial of 5 is: "+ factorial(x));
        System.out.println("2.The factorial of 5 is: "+ factorial_iterative(x));

        // 2 . Fibonacci Series
        int a = 9;
        for(int i=1;i<=a;i++){
            System.out.print(fibonacci(i));
        }

    }
}
