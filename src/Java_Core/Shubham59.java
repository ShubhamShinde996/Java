package Java_Core;
// 71 . Creating a java Thread Using Runnable InterFace

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 20) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 20) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}
public class Shubham59 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread Gun1 =  new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread Gun2 =   new Thread(bullet2);
        Gun1.start();
        Gun2.start();


    }
}
