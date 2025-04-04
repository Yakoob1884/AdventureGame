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

    }

    @Override
    public void gameIntro(){

    }

    @Override
    public int gameScoreController(){
        return 0;
    }
}