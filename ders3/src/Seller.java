import java.util.ArrayList;
import java.util.List;

public class Seller extends Users{
    @Override
    public void showProduct(Product product) {}
    List<Product> products = new ArrayList<Product>();
    public void addProduct(Product product){
        products.add(product);
    }
}
