package Java_Core;
// 59 . Java Tutorial : Polymorphism in Interfaces

interface MyCamera1 {
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

interface Mywifi1 {
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone1{
    void callNumber(int phoneNumber) {
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....!");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements Mywifi1 , MyCamera1 {
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
    public void samplemeth(){
        System.out.println("samplemeth");
    }
}

    public class Shubham52 {
    public static void main(String[] args) {
        MyCamera1 MC = new MySmartPhone1();
        //MC.getNetwork(); ----> Not allowed
        //MC.samplemeth(); -----> Not allowed

        MC.record4KVideo(); // This is a smartphone but use it as a camera

        MySmartPhone1 MS = new MySmartPhone1();
        MS.recordVideo();
        MS.recordVideo();
        MS.recordVideo();
        MS.connectToNetwork("Shubham");
        MS.pickCall();



    }
}
