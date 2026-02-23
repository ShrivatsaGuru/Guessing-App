/*
Guessing App : Use Case 1
This class serves as the application entry point.
It Starts the game and displayes the rules.

No user input or gameplay logic has been implemented yet.

@author Developer
@version 1.0

*/
public class GuessingGame
{
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game");
        GameConfig gc=new GameConfig();
        gc.showRules();
    }
}
