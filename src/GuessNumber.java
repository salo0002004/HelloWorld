import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {


        Scanner yes = new Scanner(System.in);
        //int numberToGuess = 5;
        int userToGuess = -1;

        System.out.println("Guess the number between 1 and 10");

        Random rand = new Random();
        int numberToGuess2 = rand.nextInt(10) + 1;
        int numberOfTries = 0;

        while (numberToGuess2 != userToGuess) {
            userToGuess = yes.nextInt();
            System.out.println();


            if (userToGuess > numberToGuess2) {
                System.out.println("Wrong number, try again with lower number");
            } else if (userToGuess < numberToGuess2) {
                System.out.println("Wrong number, try again with a higher number");
            } else {
                System.out.println("Correct number");
                System.out.println("You guessed correctly after" + numberOfTries + " number of tries");

            }

        }

    }

}



