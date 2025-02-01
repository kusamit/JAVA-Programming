
package Main;
import view.AddProductView;
import controller.ProductController;
/**
 *
 * @author Amit Mahato
 */
public class Main {
    public static void main(String[] args) {
        AddProductView apv = new AddProductView();
        //here addProduct( method returens ProductController object)
        ProductController pc=apv.addProduct();
        System.out.println("your product is added.");
        System.out.println("Displaying your added Product.");
        pc.displayProduct();
    }
    
}
