import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; // Random number between 1-100
        int guess = -1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("(Enter 0 to exit the game)");

        while (guess != number) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();

            if (guess == 0) {
                System.out.println("Game exited. Thank you for playing!");
                break;
            }
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter number between 1 and 100");
                continue;
            }

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number!");
            }
        }
    }
}
