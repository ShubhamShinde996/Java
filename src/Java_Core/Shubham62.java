package Java_Core;
// 75 . Java Thread Methods

class MyNewThreads1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("Thank You : ");
            try {
                Thread.sleep(455);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThreads2 extends Thread{
    public void run(){
        while(true){
            System.out.println("My Thank You Shubham : ");
        }
    }
}
public class Shubham62 {
    public static void main(String[] args) {
        MyNewThreads1 t1 = new MyNewThreads1();
        MyNewThreads2 t2 = new MyNewThreads2();
        t1.start();
        try {
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();


    }
}
