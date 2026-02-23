import java.util.Scanner;
/*
This class is responsible for deciding 
whether the game should be restarted or not
according to the user's input.
 */

public class GameController {
    /*
    Ask the user for restarting the game. 
    If user replies Yes then return yes otherwise return No 
    */
    public static boolean restartGame(Scanner sc)
    {
        System.out.print("Do you want to restart the game? Yes | No -");
        return sc.nextLine().equalsIgnoreCase("yes");
    }
}
