import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessingGame {


    public int gameController(Scanner scanner) {



        System.out.println("\n" + "\"\"\"\n" +
                "    ┌───────────────────────────────────────────────┐\n" +
                "    │                   HOGSMEADE                   │\n" +
                "    └───────────────────────────────────────────────┘\n" +
                "\n" +
                "    Snow crunched beneath Harry’s boots as he stepped into the silent streets of Hogsmeade.\n" +
                "\n" +
                "    From the shadows, a familiar voice echoed.\n" +
                "\n" +
                "    “Finally showed up, Potter?” sneered Malfoy, stepping into view. “Let’s settle this. No wands. Just wit.”\n" +
                "\n" +
                "    A magical duel of the mind. A number-guessing challenge, fueled by dark spells.\n" +
                "\n" +
                "    “Guess wrong,” Malfoy grinned, “and I’ll leave you broken.”\n" +
                "\n" +
                "    Let the mental duel begin.\n" +
                "    \"\"\"");

        Random random = new Random();
        int answer = random.nextInt(20) + 1;

        int guess = 0;
        boolean validInput;
        List<Integer> guesses = new ArrayList<>();

        for (int i = 5; i > 0; ) {
            validInput = false;

            while (!validInput) {
                System.out.println("\nEnter a number: ");

                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    validInput = true;
                    guesses.add(guess);
                    i--;
                } else {
                    String invalidInput = scanner.next();
                    System.err.println(invalidInput + " is not an integer. Try again..");
                }
            }

            if (guess == answer) {
                System.out.println("Your guess is correct! WOW!!!");
                return 10;
            } else if (guess < answer) {
                System.out.println("Your guess, " + guess + ", is too low");
            } else {
                System.out.println("Your guess, " + guess + ", is too high");
            }

            if (i > 0) {
                System.out.println("You have " + i + " attempts left.");
            } else {
                System.out.println("Game over! The correct number was: " + answer + " and you guessed " + guess);
                System.out.println("Your guesses: " + guesses);
                return 0; //
            }
        }

        return 0;
    }
}
            //TODO: Return . GamePlayer.getTotalScore + score


