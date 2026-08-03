package Java_Core;
// 47 . super Keyword using
class alpha {
    int a;

    public int getA() {
        return a;
    }
    alpha(int a) {
        this.a = a;
    }
    public int Revrese(){
        return 1;
    }
}
class Beeta extends alpha {
   Beeta(int c){
       super(c); // Using for the calling the alpha constructor
       System.out.println("I am a Constructor");
   }
}
public class Shubham42 {
    public static void main(String[] args) {
// 1 . can be used to refer immediate parent class instance variable
// 2 . can be used to invoke parent class methods call
// 3 . can be used to invoke parent class constructor call
        alpha ap = new alpha(13);
        Beeta beeta = new Beeta(12);
        System.out.println(ap.getA());
    }
}
