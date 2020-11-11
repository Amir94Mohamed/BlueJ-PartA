import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * The Stock demo runs from one command from start to finish and shows an example
 * of products being delievered and sold.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Amir Mohamed
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random randomNumGenerator;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomNumGenerator = new Random();
        
        manager.addProduct(new Product(101, "Playstation 1 "));
        manager.addProduct(new Product(102, "Playstation 2 "));
        manager.addProduct(new Product(103, "Playstation 3 "));
        manager.addProduct(new Product(104, "Playstation 4 "));
        manager.addProduct(new Product(105, "Xbox 360 "));
        manager.addProduct(new Product(106, "Xbox One"));
        manager.addProduct(new Product(107, "Nintendo Switch"));
        manager.addProduct(new Product(108, "Gaming Mouse"));
        manager.addProduct(new Product(109, "Gaming Headset"));
        manager.addProduct(new Product(110, "Gaming Keyboard"));
    }
    
    /**
     * The main mathod that runs the entire Stock Demo from start to finish 
     * for efficiency.
     */
    public void runDemo()
    {
        manager.printAllProducts();
        deliveryDemo();
        manager.printAllProducts();
        sellDemo();
        manager.printAllProducts();
    }

    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void deliveryDemo()
    {
        int quantity = 0;
        
        for (int id = 101; id <= 110; id++)
        {
            quantity = randomNumGenerator.nextInt(11);
            manager.deliveryOfProducts(id, quantity);
        }
    }

     /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * products are sold, and then the details are shown again.
     */
    private void sellDemo()
    {
        int quantity = 0;
        
        for (int id = 101; id <= 110; id++)
        {
            quantity = randomNumGenerator.nextInt(4);
            manager.sellProduct(id, quantity);
        }
    }
    
    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}