package Java_Core;
// 111 . File Handling in Java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Shubham91 {
    public static void main(String[] args) {
        /*
        // Code to create a new file
        File myFile = new File("Shubham91file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        */
        // code to write to a file
        try {
            FileWriter fw = new FileWriter("Shubham91file.txt");
            fw.write("This is our first file from this java course \n Okay now bye ");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        // Reading a file
//        File myFile = new File("This.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while( sc.hasNextLine() ){
//            String line = sc.nextLine();
//            System.out.println(line);
//            }
//        sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        File myFile =  new File("Shubham91file.txt");
//        if(myFile.delete()){
//            System.out.println("File deleted successfully " + myFile.getName());
//        }
//        else{
//            System.out.println("Some error occurred while deleting the file " + myFile.getName());
//        }
    }
}
