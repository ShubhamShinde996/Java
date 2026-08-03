package Java_Core;
// 49 . Dynamic Method Dispatch in java
class Phone{
    public void showTime(){
        System.out.println("Time is 8 AM");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class SmartPhone extends Phone{
   public void Music(){
       System.out.println("Aapka Swagat Hain !");
   }
    public void name(){
        System.out.println("My name is Java in class Two");
    }
}
public class Shubham44 {
    public static void main(String[] args) {

//        Phone p = new Phone(); //Allowed
//        SmartPhone s = new SmartPhone(); //Allowd
//        s.greet();
//        p.name();

        Phone SP = new SmartPhone(); // Yes Its allowed
        SP.showTime();
        SP.name();
        // SP.Music(); // Not Allowed (all term run honge sirf ye term nhi run hogi )
        // SmartPhone SP1 = new Phone(); // Not Allowed
    }
}
