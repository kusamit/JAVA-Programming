
package model;

/**
 *
 * @author Amit Mahato
 */
public class ProductModel {
    private String title;
    private double price;
    private int quantity;
    private String category;
    
    public ProductModel(String title, double price,int quantity,String category)
    {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public ProductModel()
    {
        this.title = "";
        this.price = 0;
        this.quantity = 0;
        this.category = "";
    }
    public void setTitle(String param_title)
    {
        this.title=param_title;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setPrice(double param_price)
    {
        this.price=param_price;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setCategory(String param_category)
    {
        this.category=param_category;
    }
    public String getCategory()
    {
        return this.category;
    }
    public void setQuantity(int param_category)
    {
        this.quantity=param_category;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    
}
