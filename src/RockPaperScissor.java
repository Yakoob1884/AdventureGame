import java.util.*;

public class RockPaperScissor {
    String rps;

    public RockPaperScissor(String rps) {
        this.rps = rps.toLowerCase();
    }

    public RockPaperScissor() {

    }

    public static String ANSI_RED = "\u001b[0;31m";
    public static String ANSI_RESET = "\u001b[0;0m";


    //Compare HarryPotter to Troll
    public int compareTo(RockPaperScissor troll) {
        if (this.rps.equals(troll.rps)) {
            return 0; //It's a tie
        }
        if (this.rps.equals("rock") && troll.rps.equals("scissor")) {
            return 1; //rock > scissor
        }
        if (this.rps.equals("scissor") && troll.rps.equals("paper")) {
            return 1; //scissor > paper
        }
        if (this.rps.equals("paper") && troll.rps.equals("rock")) {
            return 1; //paper > rock
        }
        return -1; //Troll wins
    }


    public void rockPaperScissor() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int roundsPlayed = 0;
        int maxRounds = 3;

        while (roundsPlayed < maxRounds) {

            String[] userChoices = {"Rock", "Paper", "Scissor"};
            System.out.println("What do you want to do?");
            System.out.println("Please write out your move: Rock, Paper og Scissor");

            String userInput = scanner.nextLine();

            //Validation
            while (!userInput.equalsIgnoreCase("Rock") && !userInput.equalsIgnoreCase("Paper")
                    && !userInput.equalsIgnoreCase("Scissor")) {
                System.out.println("Invalid input, please chose between: Rock, Paper og Scissor");
                userInput = scanner.nextLine();
            }

            int trollChoiceIndex = random.nextInt(3);
            String trollChoice = userChoices[trollChoiceIndex];


            System.out.println("The troll trows a " + trollChoice);

            //To use the compareTo() in RockPaperScissor class, create objects for user/troll.
            RockPaperScissor user = new RockPaperScissor(userInput);
            RockPaperScissor troll = new RockPaperScissor(trollChoice);

            //int compare = userInput.compareTo(trollChoice); would just use the String.compareTo() it would sort lexicographically (alphabetically)
            int compare = user.compareTo(troll);

            if (compare == 0) {
                System.out.println("It was a tie.");
                roundsPlayed++;

            } else if (compare == 1) {
                System.out.println("Harry won!");
                System.out.println("\nPress ENTER to continue.");
                scanner.nextLine();
                break;

            } else if (compare == -1) {
                System.out.println("The troll won");
                roundsPlayed++;
            } else {
                System.out.println(ANSI_RED + "Shit ain't working" + ANSI_RESET);

            }

            if (roundsPlayed == maxRounds) {
                System.out.println("\nHarry lost against the troll. Press ENTER to continue.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}

