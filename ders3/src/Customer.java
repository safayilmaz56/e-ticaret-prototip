public class Customer extends Users{
   Cart cart = new Cart();
    @Override
    public void showProduct(Product product) {}
    public void addCart(Product product){
        cart.addProduct(product);
    }
    public Cart getCart(){
        return cart;
    }
}
