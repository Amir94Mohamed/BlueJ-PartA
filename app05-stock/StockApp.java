/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author (Amir Mohamed)
 * @version 1
 */
public class StockApp
{
    public final int FIRST_ID = 200;
    public final String ADD = "add";

    // Use to get user input
    private InputReader input;

    private StockManager manager = new StockManager();

    private StockDemo demo;

    private int nextID = FIRST_ID;

    private String [] menuChoices;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);

        setUpMenu();
    }

    private void setUpMenu()
    {
        menuChoices = new String []
        {
            "Add a new product",
            "Remove an old product",
            "Rename the product",
            "Sell product",
            "Deliver a product",
            "Low Stock list",
            "Restock product",
            "Print all products",
            "Quit the program"
        };
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();

            String choice = Menu.getMenuChoice(menuChoices);
            executeMenuChoice(choice);

            if(choice.startsWith("quit"))
                finished = true;
        }
    }

    /**
     * 
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.startsWith(ADD))
        {
            addProduct();
        }
        else if(choice.startsWith("remove"))
        {
            removeProducts();
        }
        else if(choice.startsWith("print"))
        {
            printAllProducts();
        }
        else if(choice.startsWith("rename"))
        {
            renameProduct();
        }
        else if(choice.startsWith("sell"))
        {
            sellProduct();
        }
        else if(choice.startsWith("deliver"))
        {
            deliverProduct();
        }
        else if(choice.startsWith("low"))
        {
            printLowStock();
        }
        else if(choice.startsWith("restock"))
        {
            restock();
        }
    }

    public void addProduct()
    {
        System.out.println("Add a new Product");
        System.out.println();

        System.out.println("Please enter the name of the product");
        String name = input.getInput();

        if(name.isEmpty())
        {
            System.out.println("You have entered a blank name");
        }
        else
        {
            boolean isDuplicate = manager. isDuplicateID(nextID);
            if(isDuplicate)
            {
                boolean finished = false;

                while(!finished)
                {
                    nextID++;
                    if(manager.isDuplicateID(nextID))
                    {
                        finished = true;
                    }
                }
            }

            Product product = new Product(nextID, name);
            manager.addProduct(product);

            System.out.println("/nAdded " + product + " to the stock\n");
            nextID++; 
        }

    }

    public void removeProducts()
    {
        System.out.println("Remove an old Product");
        System.out.println();

        System.out.println("Please enter the id of the product");
        String number = input.getInput();

        int id = Integer.parseInt(number);
        manager.removeProduct(id);
    }   

    public void renameProduct()
    {
        System.out.println("Rename existing product");
        System.out.println();

        int id = input.getInt("Please enter the id of the product");
        manager.removeProduct(id);
    }

    public void restock()
    {
        int stockLevel = input.getInt("Please enter low stock level");
        int restockLevel = input.getInt("Please enter the restock level");
        manager.printLowStock(stockLevel, restockLevel);
    }

    public void sellProduct()
    {
        System.out.println("Sell an existing product");
        System.out.println();

        int id = input.getInt("Please enter the id of the product");
        int quantity = input.getInt("Please enter the quantity of the product");
        manager.sellProduct(id,quantity);

    }

    public void deliverProduct()
    {
        System.out.println("Enter ID of product for deliver");
        System.out.println();
    }

    public void printLowStock()
    {
        int stockLevel = input.getInt("Please enter low stock level");

        manager.printLowStock(stockLevel, 0);
    }

    public void printAllProducts()
    {
        manager.printAllProducts();
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Amir Mohamed");
        System.out.println("******************************");
    }
}