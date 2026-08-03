package Java_Core;
// 109 . Java Anonymous Classes & Lambda Expressions

interface Demoano {
    void meth1(int a);
 //   void meth2();
}

//class HarryFunC implements Demoano {
//    @Override
//    public void meth1() {
//        System.out.println("This is method1");
//    }
//}
//class AnonyDemo implements Demoano {
//    void display(){
//        System.out.println("this is display");
//    }
//    @Override
//    public void meth1(){
//          System.out.println("this is meth1");
//    }
//    @Override
//    public void meth2(){
//         System.out.println("this is meth2");
//    }
//}
public class Shubham89 {
    public static void main(String[] args) {
//        Demoano obj = new AnonyDemo();
//        obj.meth1();
//        obj.meth2();

//        Demoano obj = new Demoano() {
//            @Override
//            public void meth1() {
//                System.out.println("this is meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("this is meth2");
//            }
//        };
        // lambada expression
        Demoano obj = (a)-> {System.out.println("I am Method 1 from this lambada " + a);};
        obj.meth1(6);
    }

}
