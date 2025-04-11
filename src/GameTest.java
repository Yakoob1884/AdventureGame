public class GameTest {

    public static void main(String[]args){
        MenuController menuController = new MenuController();
        DiagonAlley diagonAlley = new DiagonAlley();
        Hogsmeade hogsmeade = new Hogsmeade();
        Hogwarts hogwarts = new Hogwarts();

        menuController.startGame(diagonAlley, hogsmeade, hogwarts);
    }

}
