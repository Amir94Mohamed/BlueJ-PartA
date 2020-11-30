
/**
 * The StockDemo will have all the stock written in it with its
 * unique ID number which will make the product easier to locate
 * there is also a findProduct method here which will help to locate
 * a product without too much hassle.
 * 
 * @author (Amir Mohamed)
 * @version 1
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    /**
     * all products have been listed below
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
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
     * This method will run the test needed to show that products can
     * be delivered. This method meets the requirements.
     */
    public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
       demoSellProducts();
       demoRemoveProduct();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoDeliverProducts()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Delivery of products
        manager.deliverProduct(101, 13);
        manager.deliverProduct(102, 10);
        manager.deliverProduct(103, 7);
        manager.deliverProduct(104, 3);
        manager.deliverProduct(105, 22);
        manager.deliverProduct(106, 21);
        manager.deliverProduct(107, 17);
        manager.deliverProduct(108, 5);
        manager.deliverProduct(109, 1);
        manager.deliverProduct(110, 14);
        manager.printAllProducts();
    }
    
    public void demoSellProducts()
    {
        System.out.println("\nDemo of Selling\n");
        int amount = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            amount++;
            manager.sellProduct(id, amount);
        }
    }
    
    public void demoRemoveProduct()
    {
        manager.removeProduct(104);
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}