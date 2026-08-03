package Java_Core;

import java.io.FileWriter;
import java.io.IOException;

// 112 . Advanced Java 2 - Practice Set
class MyDeprecated {
    @Deprecated
    void meth1()
    {
        System.out.println("I am Method 1");
    }
}
// Problem 2
interface MyInt{
    void display();
}
public class Shubham92 {
    public static void main(String[] args) {

        // Problem 1
        // Problem 2
        MyDeprecated d = new MyDeprecated();
        d.meth1();

        // problem 3
//        MyInt i = new MyInt(){
//            public void display(){
//                System.out.println("I am displaying");
//            }
//        };
//        MyInt i = () -> System.out.println("I am Displaying");


        int i = 19;
        String table = " ";
        for (int j = 0; j < 10; j++) {
            table += i + "X" + (j + 1) + "=" + i * (j + 1);
            table += "\n";
        }
        try {
            FileWriter fw = new FileWriter("MultiplicationTable.txt");
            fw.write(table);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}