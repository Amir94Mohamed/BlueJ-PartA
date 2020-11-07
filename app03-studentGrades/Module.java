
/**
 * Here we have the module class and it has three classes which is title,
 * code number and mark
 *
 * @author (Amir Mohamed)
 * @version (02/11/2020)
 */
public class Module
{
    //here we have the title class
    private String title;
    // here we have the code number class
    private String codeNo;
    // here have the mark class
    private int mark;
    // here we have created a boolean
    private boolean completed;
    
    /**
     * Here is the constuctor for the module class
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }
    
    /**
     * Here we have the getTitle method. 
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * Here we have the getCodeNo method.
     */
    public String getCodeNo()
    {
        return this.codeNo;
    }
    
    /**
     * here is the getMark method.
     */
    public int getMark()
    {
        if(this.mark == -1)
        {
            System.out.println(" no mark for this module!");
        }
        return this.mark;
    }
        
    /**
     * here we have the awardMark method.
     */
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
            if (mark > 40) completed = true;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }   
    
    /**
     * Here we have the printing method.
     */
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
        System.out.println("percentage will be the same as the original mark");
        
    }

}