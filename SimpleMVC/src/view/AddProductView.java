
package view;
import controller.ProductController;
/**
 *
 * @author Amit Mahato
 */
public class AddProductView {
    public ProductController addProduct()
    {
        boolean status=false;
        String title="fruits";
        double price = 2700.00;
        String category = "Vegetable";
        int quantity=10;
        ProductController pc= new ProductController();
        pc.setTitle(title);
        pc.setPrice(price);
        pc.setQuantity(quantity);
        pc.setCategory(category);
        return pc;
    }
    
}
