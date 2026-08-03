package Java_Core;
// 56 . Why Multiple inheritance is not supported in java (Only Theory Explaination)
// 57 . Java interfaces Example & Default Methods
interface MyCamera {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...!");
    }
}

interface Mywifi {
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....!");
    }
}
class MySmartPhone extends MyCellPhone implements Mywifi , MyCamera {
    public void takeSnap() {
        System.out.println("Taking Snap");
    }
    public void recordVideo() {
        System.out.println("Taking Video");
    }
//    public void record4kVideo() {
//        System.out.println("Taking Snap and recording in 4k");
//    }
    public String [] getNetworks() {
        System.out.println("Getting List of Networks");
        String [] networkList = {"Shubham","Scolar","Rushi"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);
    }
}
public class Shubham50 {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();
        mySmartPhone.record4KVideo();
        //mySmartPhone.greet(); ----> Throws and error
        String [] ar = mySmartPhone.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }

    }
}
