import java.util.List;

public class Order {
    private List<Product> products; // Aggregation

    public Order(List<Product> products) {
        this.products = products;
    }

    public void placeOrder() {
        System.out.println("Order placed for:");
        for(Product p : products) {
            System.out.println(p.getName());
        }
    }
}
