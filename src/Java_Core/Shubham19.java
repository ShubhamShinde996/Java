package Java_Core;
// 24 . Continue And Break
public class Shubham19 {
    public static void main(String[] args) {
        // break and continue using loops !
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            System.out.println("Java is Great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        // 2 .
//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        } while (i < 5);
//        System.out.println("Loops ends here");


        // 3. Continue
        for(int i=0;i<=50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }
    }
}
