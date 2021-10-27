package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessTheNumber guessTheNumber = new GuessTheNumber(1, 100, 6);

        /*
        System.out.printf("Választottam egy számot %d és %d között, maximum %d-szor próbálkozhat kitalálni (%d)!%n"
                ,guessTheNumber.getOrigin(),  guessTheNumber.getBound(), guessTheNumber.getMaxAttempts(), guessTheNumber.getNumberToGuess());
         */

        System.out.printf("Választottam egy számot %d és %d között, maximum %d-szor próbálkozhat kitalálni!%n"
                ,guessTheNumber.getOrigin(),  guessTheNumber.getBound(), guessTheNumber.getMaxAttempts());

        ComparsionResult result = ComparsionResult.UNDEFINED;
        for (int i = 1; guessTheNumber.hasMoreAttempts() && result != ComparsionResult.EQUAL; i++) {
            System.out.printf("%d. próbálkozás: ", i);
            int guess = scanner.nextInt();
            result = guessTheNumber.tryIt(guess);
            System.out.println(result.getDescription());
        }

        if (result == ComparsionResult.EQUAL) {
            System.out.println("Gratulálok, kitalálta!");
        } else {
            System.out.println("Legközelebb biztosan sikerülni fog!");
        }
    }

    private int origin;
    private int bound;
    private int numberToGuess;
    private int attempts;
    private final int maxAttempts;

    public GuessTheNumber(int origin, int bound, int maxAttempts) {
        this.origin = origin;
        this.bound = bound;
        this.maxAttempts = maxAttempts;

        Random random = new Random();
        numberToGuess = random.nextInt(origin, bound);
    }

    public ComparsionResult tryIt(int guess) {
        attempts++;
        if (guess < numberToGuess) return ComparsionResult.LESS;
        if (guess > numberToGuess) return ComparsionResult.GREATER;
        return ComparsionResult.EQUAL;
    }

    //Csak a tesztelés kedvéért...
    public int getNumberToGuess() {
        return numberToGuess;
    }

    public boolean hasMoreAttempts() {
        return attempts < maxAttempts;
    }

    public int getOrigin() {
        return origin;
    }

    public int getBound() {
        return bound;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}
