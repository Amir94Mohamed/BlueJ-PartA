/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Amir Mohamed
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // Selected ticket by the user
    private Ticket selectedTicket;
    // inserting coin
    private Coin coin;
    /**
     * here we have a ticket machine contructor.
     */
    public TicketMachine(int insertedCoins)
    {
        printAllAvailableTickets();
        price = 0;
        balance = insertedCoins;
        total = 0; 
    }

    /** in this method the user can choose his destination
     */
    public void selectTicket(String destination)
    {
        if(destination == "high wycombe")
        {
            this.selectedTicket = new Ticket(destination, "12/10/2020"); 
            this.price = this.selectedTicket.getCost(); 
        }
        else if(destination == "aylesbury")
        {
            this.selectedTicket = new Ticket(destination, "12/10/2020"); 
            this.price = this.selectedTicket.getCost();
        }
        else if(destination == "amersham")
        {
            this.selectedTicket = new Ticket(destination, "12/10/2020"); 
            this.price = this.selectedTicket.getCost();
        }
        else
        {
            System.out.println("Invalid ticket destination!");
        }
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * here the user will have to insert the amount of money which needs to be inserted
     */
    public void insertMoney(int amount)

    {if(this.selectedTicket !=null)
        { if (amount > 0){
                balance = balance + amount;
                System.out.println("Inserted" + amount + "cents.");
                printTicket();
            }
            else 
            {
                System.out.println("Use a positive amount rather than: " +
                    amount);
            }
        }
        else
        {

            System.out.println("Please select a ticket before insert more coins!");

        }
    }

    /**
     * Here it prints out the destination cost and the date purchased
     */
    public void printTicket()
    {
        if(balance >= this.price) 
        {
            String destination = this.selectedTicket.getDestination();
            String date = this.selectedTicket.getDatePurchased();
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# " + destination);
            System.out.println("# Ticket");
            System.out.println("# " + this.price + " cents.");
            System.out.println("# " + date);
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + this.price;
            // Reduce the balance by the price.
            balance = balance - this.price;

            refundBalance();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                (this.price - balance) + " more cents.");

        }

    }
    /**
     * here it refunds the balance
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        System.out.println("Total collected: "+ this.total);
        System.out.println("Refunded balance: "+ amountToRefund);
        return amountToRefund;
    }

    /**
     * here it prints out all the available ticket 
     */
    private void printAllAvailableTickets()
    {
        System.out.println("1. Aylesbury costing £2.20");
        System.out.println("2. Amersham costing £3.00");
        System.out.println("3. High Wycombe costing £3.30");
        System.out.println("Inserted amount:" + getBalance());
        System.out.println("Please, select one of the tickets!");

    }
}