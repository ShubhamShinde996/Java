package Java_Core;
// 60 . Java Practice Questions on Abstract classes & Interfaces

// 1 . Practice Problem
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }
    void refill() {
        System.out.println("refill");
    }
    void changeNib() {
        System.out.println("Changing the Nib");
    }
}

// 2 . Practice Problem
class Monkey {
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey  implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
// 3 . Practice Problem
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class NewPhone  extends Telephone{
    void ring(){
        System.out.println("Ring...");
    }
    void lift(){
        System.out.println("Call Lifted on New SmartPhone ...");
    }
    void disconnect(){
        System.out.println("Call Disconnected on New SmartPhone ...");
    }
    void camera(){
        System.out.println("Opening Camera in New SmartPhone ...");
    }
}
// 4 . Practice Problem 2 refer

// 5 . Practice Problem
interface Remote {
    void powerOn();
    void powerOff();
}
interface SmartRemote extends Remote{
    void openYoutube();
    void openNetflix();
}
class TV implements SmartRemote {
    public void powerOn(){
        System.out.println("TV is on...");
    }
    public void powerOff(){
        System.out.println("TV is off...");
    }
    public void openYoutube(){
        System.out.println("Opening Youtube...");
    }
    public void openNetflix(){
        System.out.println("Opening Netflix...");
    }
}

public class Shubham53 {
    public static void main(String[] args) {
        // 1 . Practice Problem
        System.out.println("1.Abstract classes and interface : ");
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        // 2 . Practice Problem
        System.out.println("2.It's extends And implement in uses : ");
        human h = new human();
        h.speak();
        h.eat();
        h.sleep();

        // 3 . Practice Problem
        System.out.println("3.Anstract class and basic class calling : ");
        Telephone tl = new NewPhone();
        tl.ring();
        tl.lift();
        tl.disconnect();

        //tl.camera(); Not allowed ( refernce type telephone )

       // 4 . Practice Problem
        System.out.println("4.It's Polymorphism : ");
        Monkey m = new human();
        m.bite();
        m.jump();
       // m.speak(); -----> Cannot use speak method because the reference is moneky which does not have speak method
        BasicAnimal avi = new human();
      //  avi.speak();-----> Cannot use speak method because the reference is moneky which
        avi.eat();
        avi.sleep();

        // 5 . Practice Problem
        System.out.println("5.Inherits another interfaces : ");
        TV tv = new TV();

        tv.powerOn();
        tv.openYoutube();
        tv.openNetflix();
        tv.powerOff();



    }
}
