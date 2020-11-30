/**
 * Write a description of class Menu here.
 *
 * @author (Amir Mohamed)
 * @version 1
 */
public class Menu
{
    private static InputReader reader = new InputReader();
    
    /**
     * Display all the valid choices and make sure that the user 
     * chosen before returning
     */
    public static String getMenuChoice(String [] choices)
    {
        boolean isValid = false;
        String choice = null ;
        
        while(!isValid)
        {
            printChoices(choices);
            
            choice = reader.getInput();
            choice = choice.toLowerCase();
            
            isValid = checkIsValid(choices,choice);
        }
        return choice;
    }
    
    private static boolean checkIsValid(String [] choices, String choice)
    {
        for (String validChoice : choices)
        {
            validChoice = validChoice.toLowerCase();
            if(validChoice.startsWith(choice))
                return true;
        }
        System.out.println ("Invalid Menu Choice");
        return false; 
    }
    
    private static void printChoices(String []choices)
    {
        System.out.println("Enter the first word, your choices are; \n");
        
        for(String choice: choices)
        {
            System.out.println("    " + choice);
        }
    }
}