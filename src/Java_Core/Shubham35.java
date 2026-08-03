package Java_Core;
// 42 . Java tutorial : - Constructor in Java
class MyMainEmployee {
    public MyMainEmployee() {
        id = 0 ;
        name = "Your-Name-Here";
    }
public MyMainEmployee(String Myname, int myId ) {
    id=myId;
    name = Myname;
}
 // method overloading for constructor
    public MyMainEmployee(String Myname) {
        id = 1 ;
        name = Myname;
    }
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}
public class Shubham35 {
    public static void main(String[] args) {

        //MyMainEmployee emp = new MyMainEmployee("The_Gammer_Shubham",12);
        //employee constructor is overloaded
        MyMainEmployee emp = new MyMainEmployee();
        //emp.setName("Shubham");
        //emp.setId(34);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
