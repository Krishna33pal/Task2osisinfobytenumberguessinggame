import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 10;
        int attempts = 0;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!");

        while (attempts < maxAttempts) {
            String input = JOptionPane.showInputDialog("Guess the number between " + lowerBound + " and " + upperBound + ":");
            
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Thanks for playing!");
                break;
            }

            int userGuess = Integer.parseInt(input);
            attempts++;

            if (userGuess < numberToGuess) {
                JOptionPane.showMessageDialog(null, "Try a higher number! Attempts: " + attempts);
            } else if (userGuess > numberToGuess) {
                JOptionPane.showMessageDialog(null, "Try a lower number! Attempts: " + attempts);
            } else {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                break;
            }
        }

        if (attempts == maxAttempts) {
            JOptionPane.showMessageDialog(null, "Out of attempts! The number was " + numberToGuess + ".");
        }
    }
}
