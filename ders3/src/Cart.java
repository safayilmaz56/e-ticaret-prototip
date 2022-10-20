import java.util.ArrayList;
import java.util.List;
public class Cart {
    List<Product> products = new ArrayList<Product>();
    public int cartCalculate(){
        int total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }
    public void addProduct(Product product){
        products.add(product);
    }
}
