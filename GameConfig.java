import java.util.Random;
/*
Use Case 1: Game Initialization.

This Class is responsible for 
    - Setting Game boundaries
    -Generating Random numbers
    -Displaying game rules
Demonstrates:
    -Encapsulation
    -Constuctor Initialization
    -Random Number Generation
*/
public class GameConfig{
    private final int MIN=1;
    private final int MAX=100;
    private final int MAX_Attempts=7;
    private final int MAX_HINTS=3;
    int targetNumber;
    public GameConfig() // Automatic constructor for configuring targetNumber
    {
        Random r=new Random();
        this.targetNumber=r.nextInt(MAX-MIN+1)+MIN;
    }
    public int getTargetNumber()    {
        return targetNumber;
    }
    public int getMAXAttempts() {
        return MAX_Attempts;
    }
    public int getMaxHints()
    {
        return MAX_HINTS;
    }
    public void showRules()
    {
        System.out.println("Guess a number between "+ MIN + " and "+ MAX);
        System.out.println("You have "+ MAX_Attempts + " Attempts left");
    }
}