package Java_Core;
// 52 . Java Tutorial : Exercise & Practice Questions On Inheritance

// Practice Problem 1
class circle1{
    public int  radius;
    circle1(){
        System.out.println("I am Non parameterzed of circle");
    }
    circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double Area(){
        return Math.PI * this.radius*this.radius;
    }
}
class cylinder1 extends circle1{
    public int height;
    cylinder1(int r ,int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double Volume(){
     return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Shubham46 {
    public static void main(String[] args) {
        // Practice Problem 1
        //circle1 c1 = new circle1(12);
        cylinder1 cylinder1 = new cylinder1(12,4);

        //Practice Problem 2


    }
}
