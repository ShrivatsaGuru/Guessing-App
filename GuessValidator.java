/*
Use Case 2: User guess validation
This class is responsible for checking
if the guess of the user is correct or not.

It gives hints to the user according to the guess

It does NOT handle user input or output.
*/
class GuessValidator
{
    public static String validateGuess(int guess, int target)
    {
        StringBuilder result = new StringBuilder();

        if (guess == target)
        {
            result.append("CORRECT");
        }
        else if (guess < target)
        {
            result.append("Try a bigger number");
        }
        else
        {
            result.append("Try a smaller number"); 
        }

        return result.toString();
    }
}