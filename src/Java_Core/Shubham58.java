package Java_Core;
// 69 . Multithreading in java
// 70 . Creating a Thread by Extending Thread Class

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i<20) {
            System.out.println("My Cooking Thread is running...!");
            System.out.println("I am Happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i<=20) {
            System.out.println("My Thread 2 for chatting with her...!");
            System.out.println("I am Sad!");
            i++;
        }
    }
}
public class Shubham58 {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
