
/**
 * Here we have the ticket class in this class it includes the desination,
 * cost and date purchased.
 *
 * @author (Amir Mohamed)
 * @version (27/10/2020)
 */
public class Ticket
{
    // here we have destination
    private String destination;
    // the cost of the ticket
    private int cost;
    //when the ticket will be purchased
    private String datePurchased;
    

    /**
     * Constructor for objects of class Ticket for destination
     */
    public Ticket(String destination, String datePurchased)
    {
        // initialise instance variables
        this.destination = destination;
        this.datePurchased = datePurchased; 
        setCost();
    }
    
    /**
     * here we have the destination and adding the cost for eachd destination
     */
    private void setCost()
    {
       if(this.destination == "aylesbury")
       {
           this.cost = 220;
       }
       if(this.destination == "amersham")
       {
           this.cost = 300;
       }
       if(this.destination == "high wycombe")
       {
           this.cost = 330;
       }
    }
      
    /**here we have added destination method
     */
    public String getDestination()
    {
        // put your code here
        return this.destination;
    }

    /** we have added the cost method
     */
    public int getCost()
    {
        return this.cost;
        
    }
    
    /** now we have added the date purchased method
     */
    public String getDatePurchased()
    {
        return this.datePurchased;
    }
}