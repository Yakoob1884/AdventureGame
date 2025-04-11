public interface Game {
    void gameController(); //Method to run the game?
    void gameIntro(); //Method to introduce the game
    int gameScoreController(); //Method to score the game?
}


//DiagonAlley implements the Game interface
class DiagonAlley implements Game{

    @Override
    public void gameController() {

    }

    @Override
    public void gameIntro() {
        System.out.println("\tThe air turned heavy as Harry stepped into the depths beneath Gringotts Bank.");
        System.out.println("Flickering torchlight revealed a massive iron gate—and behind it, a sleeping dragon\n");
        System.out.println("As Harry approached, the dragon’s eyes shot open.");
        System.out.println("\t“You seek to pass?” it growled. “Then you must beat me… in a game of cards.”");
        System.out.println("A stone table emerged from the cavern floor. Dice manifested themselves — magical blackjack.");
        System.out.println("The dragon smirked. “Oh, and I cheat.”");
        System.out.println("\n\tThe game begins.");
    }

    @Override
    public int gameScoreController() {
        return 0;
    }
}


//Hogsmeade implements the Game interface
class Hogsmeade implements Game{

    @Override
    public void gameController(){

    }

    @Override
    public void gameIntro(){
        System.out.println("\tSnow crunched beneath Harry’s boots as he stepped into the silent streets of Hogsmeade.");
        System.out.println("From the shadows, a familiar voice echoed.\n");
        System.out.println("\t“Finally showed up, Potter?” sneered Malfoy, stepping into view.");
        System.out.println("“Let’s settle this. No wands. Just wit.”\n");
        System.out.println("A magical duel of the mind. A number-guessing challenge, fueled by dark spells.");
        System.out.println("\t“Guess wrong,” Malfoy grinned, “and I’ll leave you broken.”");
        System.out.println("\nLet the mental duel begin.");
    }

    @Override
    public int gameScoreController(){
        return 0;
    }
}


//Hogwarts implements the Game interface
class Hogwarts implements Game{

    @Override
    public void gameController(){
        RockPaperScissor rockPS = new RockPaperScissor();
        rockPS.rockPaperScissor();
    }

    @Override
    public void gameIntro(){
        System.out.println("\tHogwarts was quiet. Too quiet.");
        System.out.println("Harry found himself descending into forgotten dungeons, guided only by torchlight and echoing footsteps.");
        System.out.println("At the center of a circular chamber stood a troll, enormous and… oddly philosophical.");
        System.out.println("\n“We play a game,” it rumbled. “Magical rock-paper-scissors. You win, you pass. You lose, you limp.”");
        System.out.println("\nIts club thudded to the floor, shaking the stone beneath them.");
        System.out.println("\n The troll grinned. “Choose wisely.”");
        System.out.println("  The final trial begins.");
    }

    @Override
    public int gameScoreController(){
        return 0;
    }
}