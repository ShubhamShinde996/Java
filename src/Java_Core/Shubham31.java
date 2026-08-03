package Java_Core;
// 36 (basics) and ( Class & Object ).
// 37. OOP concept ( oops terminology Abstraction,Encapsulation,Inheritance,Polymorphism )
// 38. Creating Our Own Java Class

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
    public int getSalary() {
        return salary;
    }

}
public class Shubham31 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee emp = new Employee();// Instantiating a new Employee Object
        Employee emp1 = new Employee();


       // Setting Attributes for emp
        emp.id = 10;
        emp.salary = 12000;
        emp.name = "Shubham_Shubham";


        // Setting Attributes for emp1
        emp1.id = 11;
        emp1.salary = 10800;
        emp1.name = "Roman_Jack";

        // Printing the Attributes
        System.out.println("1.Type One calling Class : - ");
        System.out.println(emp.id);
        System.out.println(emp.name);


        //
        System.out.println("2.Type Two calling Class : - ");
        emp.printDetails();
        emp1.printDetails();
        int salary = emp.getSalary();
        System.out.println(salary);
    }
}
