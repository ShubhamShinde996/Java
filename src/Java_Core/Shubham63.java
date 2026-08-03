package Java_Core;
// 76 . Java Tutorial : Practice Questions on Threads

// Practice Problem 1
class Practice1 extends Thread {
    public void run (){
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning...!");
        }
    }
}
class Practice2 extends Thread {
    public void run (){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome...!");
//        }
    }
}
public class Shubham63 {
    public static void main(String[] args) {
        // Practice Problem 1
        Practice1 practice1 = new Practice1();
        Practice2 practice2 = new Practice2();
//        practice1.setPriority(6);
//        practice2.setPriority(9);
        System.out.println(practice1.getPriority());
        System.out.println(practice2.getPriority());
        System.out.println(practice2.getState());
//        practice1.start();
        practice2.start();
        System.out.println(practice2.getState());
        System.out.println(Thread.currentThread().getState());


    }
}
