package Java_Core;
// 54 . Java Tutotrial : - Introduction to Interfaces

interface animals{
    void sound();
}
class dog implements animals{
    public void sound(){
        System.out.println("Dog Barks");
    }
}

public class Shubham48 {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();

    }
}
