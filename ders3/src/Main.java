public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Product product1 = new Product("phone",1000);
        Product product2 = new Product("computer",10000);
        customer.addCart(product1);
        customer.addCart(product2);
        System.out.println(customer.getCart().cartCalculate());
    }
}