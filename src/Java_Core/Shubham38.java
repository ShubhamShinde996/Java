package Java_Core;
// 44 . Java Tutorial : Exercise on Access Modifiers And Constructor
 // 1 . Practice Problem
class Cylinder{
    private int radius;
    private int height;

    // 4. Practice Problem : Create Constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // Practice Problem 2
    public double surfacearea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius *height;
    }
    // Practice Problem 3
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1 (){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Shubham38 {
    public static void main(String[] args) {

        // 1 . Practice Problem
        System.out.println("1.Print the Height and Radius using for Getter And Setter : ");
        Cylinder Mycylinder = new Cylinder(9,12);  // 4 . Practice Problem : Use a Constructor and repeat 1
        Mycylinder.setHeight(12);  // Practice problem 2 using value
        System.out.println(Mycylinder.getHeight());
        Mycylinder.setRadius(9);   // Practice problem 2 using value
        System.out.println(Mycylinder.getRadius());

        // 2 . Practice Problem
        System.out.println("2.Find the Surface area of Mycylinder : ");
        System.out.println(Mycylinder.surfacearea());

        // 3 . Practice Problem
        System.out.println("3.Find the Volume of Mycylinder : ");
        System.out.println(Mycylinder.volume());

        // 5. Practice Problem
        System.out.println("5.Using Constructor and custom parameter : - ");
        Rectangle1 Rec = new Rectangle1(12,56);
        System.out.println(Rec.getLength());
        System.out.println(Rec.getBreadth());

        // 6 . Practice Problem : - Sphere surface area and volume





    }
}
