package Java_Core;
// 40 . Access Modifiers
class MyEmployee {
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
public class Shubham33 {
    public static void main(String[] args) {
      MyEmployee e = new MyEmployee();
      //e.id=10;
     //e.name="Shubham_33"; -----> Throws an error due to private access modifier
        e.setName("Shubham Shinde");
        e.setId(101);
        System.out.println("1.Name of employee is "+e.getName());
        System.out.println("2.Id of employee is "+e.getId());
    }
}
