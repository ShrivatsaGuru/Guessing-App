import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*

This class is responsible for saving all the 
game results after the game ends.

All the game details are stored on the file named- "Game_Result"
so that the result does not get lost after game ends

*/
public class StorageService {
    /*
    Each record of the save file contains:
        - Player name
        - Number of attempts used
        - Win or lose
     */
    public static void saveResult(String player, int attempts, boolean win)
    {
        try(
            BufferedWriter bf=new BufferedWriter(
                new FileWriter("Game_Result.txt",true)))
                {
bf.write("Player -"+ player
    +"\n Attempts -" + attempts 
    +"\nResult: "+(win?"WIN":"LOSE"));
    bf.newLine();

                }
                catch(IOException e)
                {
                    System.out.println("Unable to save result.");
                }

        
    }
}
