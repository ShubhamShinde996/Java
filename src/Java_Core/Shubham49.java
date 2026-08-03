package Java_Core;
// 55 . Java Tutorial : - Abstract Classes Vs Interfaces
interface Bicycle{ // one interfaces and multiple classes
   final int a = 45;
    void applyBrake(int decrement);
    void SpeedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blogHornmhn();
}
class Avoncycle implements Bicycle , HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Pooo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void SpeedUp(int increment){
        System.out.println("Applying Speed Up");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi Khushi Kabhi Gum Pee Pee Pee");
    }
    public void blogHornmhn(){
        System.out.println("Main Hoon naa Po Po Po Po");
    }
}
public class Shubham49 {
    public static void main(String[] args) {
        // Interfaces 1 : - Bicycle
        System.out.println("1.Interface : - ");
        Avoncycle av = new Avoncycle();
        av.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(av.a); // 45 output
        // You cannot modify the properties in interfaces as they are final
        //av.a = 45; ----> error not change values

       // Interfaces 2 : - HornBicycle
        System.out.println("2.Interface : - ");
        av.blowHornK3g();
        av.blogHornmhn();


    }
}
