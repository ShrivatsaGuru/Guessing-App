/*
Custom exception used when user input 
fails validation.

Displays a more meaningful message.
*/

public class InputExceptionHandling extends Exception {
    public InputExceptionHandling(String message)
    {
        super(message);
    }
}
