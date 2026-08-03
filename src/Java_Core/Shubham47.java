package Java_Core;
// chapter : - 11
// 53 . Java Tutorial : - Abstract class & Abstract methods

abstract class Parent2{
    public Parent2(){
        System.out.println("I am Parent 2 Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet(); // error not define to 5 line abstract
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good AfterNoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am Good");
    }
}
public class Shubham47 {
    public static void main(String[] args) {
        //Parent2 parent = new Parent2(); // Error bcoz abstract class no working
        Child2 child = new Child2();
        //Child3 Ch3 = new Child3(); /// --->> Error



    }
}
