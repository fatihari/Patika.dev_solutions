package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */

public class App {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Game game = new Game();
        game.start();
    }
    public static void clearScreen() {
        //Shift+PgUP for scroll
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
