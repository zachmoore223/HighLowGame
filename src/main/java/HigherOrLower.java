import java.util.Random;
import java.util.Scanner;

public class HigherOrLower {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int upperbound = 101;
    int secretNumber = rand.nextInt(upperbound);

    System.out.println("Hello and welcome to Zach's High Low Game.");
    System.out.print("What is your name? ");
    String userName = input.nextLine();
    System.out.println("Welcome " + userName + "!");
    System.out.println("I am thinking of a number between 1 - 100.");
    System.out.print("Please guess the number: ");
    int userGuess = input.nextInt();
    int numAttempts = 10;
    int guessTracker = 9;

    for (int i = 1; i < numAttempts; i++) {
      if (userGuess == secretNumber) {
        System.out.println("Congrats! You win " + userName + "!");
        System.out.println("The secret number was " + secretNumber + ".");
        break;
      }
      if (userGuess < secretNumber) {
        System.out.println("Sorry, that was not it. The secret number is HIGHER!");
        System.out.println("You have " + guessTracker + " attempts left.");
        userGuess++;
        System.out.print("Please guess again: ");
        userGuess = input.nextInt();
        guessTracker--;
      } else if (userGuess > secretNumber) {
        System.out.println("Sorry, that was not it. The secret number is LOWER!");
        System.out.println("You have " + guessTracker + " attempts left.");
        userGuess++;
        System.out.print("Please guess again: ");
        userGuess = input.nextInt();
        guessTracker--;
      }

    }
    if (numAttempts == 10 && userGuess != secretNumber){
      System.out.println("Sorry, you have run out of attempts. You lose!");
      System.out.println("The secret number you was " + secretNumber + ".");
    }
  }
}
