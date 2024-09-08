import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int score = 0;
System.out.println("Welcome to the Number Guessing Game!");
System.out.print("Enter the maximum number of attempts allowed: ");
int maxAttempts = scanner.nextInt();
boolean playAgain = true;
while (playAgain) {
int targetNumber = random.nextInt(100) + 1;
int attempts = 0;
boolean correctGuess = false;
System.out.println("\nGuess a number between 1 and 100:");
while (attempts < maxAttempts && !correctGuess) {
System.out.print("Enter your guess: ");
int userGuess = scanner.nextInt();
attempts++;
if (userGuess == targetNumber) {
System.out.println("Congratulations! You guessed the number correctly.");
score += (maxAttempts - attempts + 1); // Higher score for fewer attempts
correctGuess = true;
} else if (userGuess < targetNumber) {
System.out.println("Too low! Try again.");
} else {
System.out.println("Too high! Try again.");
}
}
if (!correctGuess) {
System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
}
System.out.print("\nWould you like to play another round? (yes/no): ");
String response = scanner.next();
playAgain = response.equalsIgnoreCase("yes");
if (!playAgain) {
System.out.println("Thank you for playing! Your final score is: " + score);
}
}
scanner.close();
}
}