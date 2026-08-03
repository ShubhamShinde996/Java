package Java_Core;
// 72 . Java Thread Life Cycle
// 73 . Constructor From Tread class in Java

class MyThr extends Thread{
    public MyThr(String name) {
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank You...!");
//        while(true){
//            System.out.println("I am a Thread...!");
//        }
    }
}
public class Shubham60 {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Shubham Shinde");
        MyThr t2 = new MyThr("Ram Reddy");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is "+t1.getId());
        System.out.println("The name of the thread is "+t1.getName());
        System.out.println("The id of the thread is "+t2.getId());
        System.out.println("The name of the thread is "+t2.getName());


    }
}
