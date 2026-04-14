import java.util.*;

public class CartService {
    private List<Product> cart = new ArrayList<>(); // List

    public void addProduct(Product p) {
        cart.add(p);
        System.out.println(p.getName() + " added to cart");
    }

    public void showCart() {
        Double total = 0.0;
        for(Product p : cart) {
            System.out.println(p.getName() + " - " + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: " + total);
    }

    public List<Product> getCart() {
        return cart;
    }
}
