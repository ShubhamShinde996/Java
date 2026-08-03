package Java_Core;
// 74 . Java Thread Priorities
class MyThreadPro extends Thread {
    public MyThreadPro (String name) {
        super(name);
    }
    public void run() {
        int i = 34;
        while (true) {
            System.out.println("Thank You : " + this.getName());
        }
    }

}
public class Shubham61 {

    public static void main(String[] args) {
        // Ready Queue : T1 , T2 , T3 , T4 , T5
        MyThreadPro T1 = new MyThreadPro("Shubham1");
        MyThreadPro T2 = new MyThreadPro("Shubham2");
        MyThreadPro T3 = new MyThreadPro("Shubham3");
        MyThreadPro T4 = new MyThreadPro("Shubham4");
        MyThreadPro T5 = new MyThreadPro("Shubham5 (most important)");

        T5.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MAX_PRIORITY);
        T3.setPriority(Thread.MIN_PRIORITY);
        T4.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();



    }
}
