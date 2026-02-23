/*
Guessing App : Use Case 6
This class serves as the application entry point.
It does the following things:
    - Initialize game
    - Accept User guesses
    - Validates the user input if it is correct or not
    - Handles the errors/invalid inputs
    - Validate Guesses
    - Restarts the game if the user agrees to play more.
    - Stop when the game ends
    - Store the results of the game after it ends.

@author Developer
@version 6.0

*/
import java.util.*;
public class GuessingGamee
{
    public static void main(String[] args) throws InputExceptionHandling {
        System.out.println("Welcome to the guessing game");
        GameConfig gc=new GameConfig();
        gc.showRules();
        boolean restart=false;
        Scanner sc=new Scanner(System.in);
        /* 
        Repeat/restart all the process 
        till the users says does not want to play anymore. 
        */
        do
        {
            int attempts=0;
            int hintCount=0;
            boolean hintFlag=true; // So that it the message "No more hints available" only gets printed once.
        
        
            System.out.println("Enter the player name -");
            String player=sc.nextLine();
            boolean win=false;
            // Loop for running the game till max attempts are reached
            // or user guesses the correct number.
            while(attempts<=gc.getMAXAttempts())    
            {
                System.out.print("Guess a number- ");
                int guess=ValidationService.validateInput(sc.nextLine()); // Check if the input is valid or not
                attempts++;
                String result=GuessValidator.validateGuess(guess, gc.getTargetNumber());
                String hint=HintService.generateHint(gc.getTargetNumber(),hintCount);
                hintCount++;
                System.out.println(result);
                //Break the loop immediately if the guess is correct and change win=true.
                if(result.equals("CORRECT"))
                {
                    win=true;
                    break;
                }
                if(hintFlag)   System.out.println(hint);
                if(hint=="No more hints available")
                {
                    hintFlag=false;
                }
            }
            StorageService.saveResult(player,attempts,win);
            restart=GameController.restartGame(sc);
    }
    while(restart); // Stop when users replies no to restarting the game.

    }
}