import java.util.List;
import java.util.Scanner;

public class MenuController {
    //Attributes
    int totalPoints;
    //public List<String> injuries;
    Scanner scanner;

    //Constructor to initialize data
    public MenuController(){
        scanner = new Scanner(System.in);
        DiagonAlley diagonAlley = new DiagonAlley();
        Hogsmeade hogsmeade = new Hogsmeade();
        Hogwarts hogwarts = new Hogwarts();
    }

    public void startGame(DiagonAlley diagonAlley, Hogsmeade hogsmeade, Hogwarts hogwarts){
        boolean running = true;
        while (running){
            showIntro();

            System.out.println("\nWhere do you want to go?");
            String input = scanner.nextLine();
            int inputNum;

            try {
                inputNum = Integer.parseInt(input);
            } catch (Exception e){
                System.out.println("Input error. Please enter a number from the list.");
                continue;
            }

            switch (inputNum){
                case 1: //Go to Diagon Alley
                    diagonAlley.gameIntro();
                    diagonAlley.gameController();
                    break;

                case 2: //Go to Hogsmeade
                    hogsmeade.gameIntro();
                    hogsmeade.gameController();
                    break;

                case 3: //Go to Hogwarts
                    hogwarts.gameIntro();
                    hogwarts.gameController();
                    break;

                case 0:
                    running = false;

                default:
                    System.out.println("That's not an option. Try a number between 1-3, or 0 to exit the game.");
            }
        }
        scanner.close();
    }

    public void showIntro(){
        System.out.println("\n\t\t====\tHogwarts Challenge\t====");
        System.out.println("\tIt was a quiet morning at Hogwarts.");
        System.out.print("Harry Potter sat alone in the Great Hall.");
        System.out.println(" The sun pierced through the high\nstained glass windows, but the chill in the air had nothing to do with the weather.");
        System.out.println("Professor Dumbledore stood. His voice echoed like thunder wrapped in silk.");
        System.out.println("\t\"Mr. Potter… a new darkness rises. It cannot be fought with spells alone. ");
        System.out.println("You must complete three trials. Three paths. Each will test your courage, wit, and endurance.\"\n");
        System.out.println("A magical parchment unraveled midair before Harry, glowing with golden letters:\n");
        System.out.println("1 ✦\tDiagon Alley – a dragon guards the vaults of Gringotts");
        System.out.println("2 ✦\tHogsmeade – Malfoy awaits, wand drawn, for a cunning duel");
        System.out.println("3 ✦\tHogwarts – a troll roams the ancient lower tunnels");
        System.out.println("0\tExit game\n");
        System.out.println("\t\"Fail, and you lose more than points. You will suffer magical injuries – breaking bones, losing abilities.");
        System.out.println("Some spells will become impossible. Even everyday tasks… may not be so simple.\"");
        System.out.println("Harry clenched his wand tighter. 30 points to begin. Three trials to survive.");
    }

    public void showEnding(){

    }
}
