package Java_Core;
// 39 . Practice Set (Basics Question On Object Oriented Programming)

import java.sql.SQLOutput;

// problem 1
class Employee1{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String  getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
 }
 // Problem 2
class cellphone{
    public void ringing(){
        System.out.println("Ringing...!");
    }
    public void vibrating(){
        System.out.println("Vibrating...!");
    }
    public  void callFriend(){
        System.out.println("Calling Harry...!");
    }
 }

 // Problem 3
class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return  4*side;
    }

 }
 // Problem 4
class Rectangle {
    int length;
    int width;
    public Rectangle(int l, int w){
        length = l;
        width = w;
    }
    int area(){
        return length*width;
    }
    int perimeter(){
        return 2 * (length+width);
    }
 }
 // problem 5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running From the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
 }
 // Problem 6
class circle{
    double radius;
    void setRadius(double r){
       radius = r;
    }
    double getarea(){
        return Math.PI * radius * radius;
    }
    double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
public class Shubham32 {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("1.Employee Data : - ");
        Employee1 Shubham = new Employee1();
        Shubham.setName("Shubham");
        Shubham.salary = 2000;
        System.out.println(Shubham.getSalary());
        System.out.println(Shubham.getName());

        // problem 2
        System.out.println("2.Calling System : - ");
        cellphone Nokia = new cellphone();
        Nokia.callFriend();
        Nokia.ringing();
        Nokia.vibrating();

        // 3 . Problem 3
        System.out.println("3.Calculate side , Area , Perimeter : - ");
        Square sq = new Square();
        sq.side = 3;
        System.out.println("Side : - "+sq.side);
        System.out.println("Perimeter : - "+sq.perimeter());

        // Problem 4
        System.out.println("4.Calculate area , Perimeter for Rectangle: - ");
        Rectangle rec = new Rectangle(10,5);
        System.out.println("Area :- "+rec.area());
        System.out.println("Perimeter : - "+rec.perimeter());

        // Problem 5
        System.out.println("5.TommyVecetti For Rockstar Games : - ");
        Tommy tm = new Tommy();
        tm.fire();
        tm.run();
        tm.hit();

        // Problem 6
        System.out.println("6.Circle : - ");
        circle c = new circle();
        c.setRadius(7);
        System.out.println("Area of circle = "+c.getarea());
        System.out.println("Circumference of circle = "+c.getCircumference());




    }
}
