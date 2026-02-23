/*
Handles validation of the 
user input before it is
used in the game's logic
 */


public class ValidationService
{
    /*
    Flow:
        -Convert input to integer
        -Check allowed range
        -throw custom exception if invalid
     */
    public static int validateInput(String input) throws InputExceptionHandling
    {
        try{
            int value = Integer.parseInt(input);
            if(value<1 || value >100){
                throw new InputExceptionHandling("Number must be between 0 to 100");
            }
            return value;
        }
        catch(NumberFormatException e)
        {
            throw new InputExceptionHandling("Invalid input. Only numbers are accepted");
        }
        
    }
}