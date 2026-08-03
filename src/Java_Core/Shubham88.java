package Java_Core;
// 108 . Annotations in Java
@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();
//    void thisMethod2();
//    void thisMethod3();
//    void thisMethod4();
}
class Newphone extends Phone {
    @Override
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class Shubham88 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
       Newphone phone = new Newphone();
       phone.showTime();
       phone.sum(5,6);
    }
}
