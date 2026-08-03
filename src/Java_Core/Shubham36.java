package Java_Core;
// 42 . Quick Quiz overload the constructor
class EmployeeSalary{
    String name;
    double salary;

    EmployeeSalary(){
        salary=10000.0;
    }
    EmployeeSalary(String n,double s){
        name=n;
        salary=s;
    }
    void displaySalary(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class Shubham36 {
    public static void main(String[] args) {
        // Default salary
        EmployeeSalary employee1 = new EmployeeSalary();
        employee1.displaySalary();

        // Custom Salary
        EmployeeSalary employee2 = new EmployeeSalary("Shubham",250000);
        employee2.displaySalary();

    }
}
