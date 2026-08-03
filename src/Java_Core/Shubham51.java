package Java_Core;
// 58 . Inheritance in Interfaces
interface sample{
    void method1();
    void method2();
}
interface Childsample extends sample{
    void method3();
    void method4();
}
class MySampleClass implements Childsample{
    @Override
    public void method1() {
        System.out.println("method1 : Heyy");
    }
    public void method2() {
        System.out.println("method2 : Hiii");
    }
    public void method3() {
        System.out.println("method3 : Hellooo");
    }
    public void method4() {
        System.out.println("method4 : Byyy");
    }
}
public class Shubham51 {
    public static void main(String[] args) {
        MySampleClass mySampleClass = new MySampleClass();
        mySampleClass.method1();
        mySampleClass.method2();
        mySampleClass.method3();
        mySampleClass.method4();


    }
}
