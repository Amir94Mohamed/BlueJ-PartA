import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author (Amir Mohamed)
 * @version    1
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();

        return inputLine;
    }
    
    public int getInt(String prompt)
    {
        boolean isValid = false;
        int number = 0;

        while(!isValid)
        {
            try
            {
                System.out.println(prompt);
                String value = reader.nextLine();
                number = Integer.parseInt(value);
                isValid = true; 
            }
            catch (Exception e)
            {
                System.out.println("Invalid interger!");
            }
        }
        return number;
    }
}