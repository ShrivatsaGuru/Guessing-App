/*
Guessing App : Use Case 2
This class serves as the application entry point.
It does the following things:
    - Initialize game
    - Accept User guesses
    - Validate Guesses
    - Stop when the game ends

@author Developer
@version 2.0

*/
import java.util.*;
public class GuessingGame
{
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game");
        GameConfig gc=new GameConfig();
        gc.showRules();
        Scanner sc=new Scanner(System.in);
        int attempts=0;
        int hintCount=0;
        boolean hintFlag=true;
        // Loop for running the game till max attempts are reached
        // or user guesses the correct number.
        while(attempts<=gc.getMAXAttempts())    
        {
            System.out.print("Guess a number- ");
            int guess=sc.nextInt();
            attempts++;
            String result=GuessValidator.validateGuess(guess, gc.getTargetNumber());
            String hint=HintService.generateHint(gc.getTargetNumber(),hintCount);
            hintCount++;
            System.out.println(result);
            if(hintFlag)   System.out.println(hint);
            if(hint=="No more hints available")
            {
                hintFlag=false;
            }
            //Break the loop immediately if the guess is correct.
            if(result=="CORRECT")
            {
                break;
            }
        }

    }
}