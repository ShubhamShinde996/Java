package Java_Core;
// 43 . Guess The Number  (OOPs Edition)

import java.util.Scanner;
import java.util.Random;

class game {
    public int number;
    public int InputNumber;
    public int noOfGuesses=0;


    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserInput() {
        System.out.println("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();

    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (InputNumber == number) {
            System.out.format("Yes you guessed it right,it was %d\n You guessed it in %d attempts", number);
            return true;
        }
        else if(InputNumber < number) {
            System.out.println("Too Low");
        }
        else if(InputNumber > number) {
            System.out.println("Too High");
        }
        return false;
    }
}
public class Shubham37 {
    public static void main(String[] args) {
        /*
        Create a class Game , which aloows a user to play "Guess the Number "
        Game once.Game should have the following methods :
        1.Constructor to generate the random number
        2.TakeUserInput() to take a user input of number
        3.isCorrectNumber() to detect whether the number enterd by the user is true
        4.Getter and Setter for Noguesses
        Use Properties such as NoOfGuesses(int) etc to get this task done !
        */
// 50 . ans is Guess The Number
        game G = new game();
        boolean b = true;
        while(b) {
            G.takeuserInput();
             G.isCorrectNumber();
        }

    }
}
