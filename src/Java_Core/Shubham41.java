package Java_Core;
// 47 . this refrence using
class OneRoom {
    int a;

    public int getA() {
        return a;
    }

    OneRoom(int a) {
        //a = a; // this ---> is reference
        this.a = a;
    }
    public int returnnone(){
        return 1;
    }
}
public class Shubham41 {
//   current class variable access
//   constructor call
//   method call
    public static void main(String[] args) {
        OneRoom obj = new OneRoom(65);
        System.out.println(obj.getA());

    }
}
