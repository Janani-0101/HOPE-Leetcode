import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product(1, "Shirt", 500.0);
        Product p2 = new Product(2, "Shoes", 1200.0);

        CartService cart = new CartService();

        Map<Integer, Product> productMap = new HashMap<>(); // Map
        productMap.put(1, p1);
        productMap.put(2, p2);

        Set<Integer> productSet = new HashSet<>(); // Set
        Queue<Product> orderQueue = new LinkedList<>(); // Queue

        while(true) {
            try {
                System.out.println("\n1.View\n2.Add\n3.Cart\n4.Order\n5.Exit");
                int choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        for(Product p : productMap.values()) {
                            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
                        }
                        break;

                    case 2:
                        System.out.print("Enter product id: ");
                        int id = sc.nextInt();

                        if(productMap.containsKey(id)) {
                            cart.addProduct(productMap.get(id));
                            productSet.add(id);
                        } else {
                            throw new Exception("Invalid Product ID");
                        }
                        break;

                    case 3:
                        cart.showCart();
                        break;

                    case 4:
                        Order order = new Order(cart.getCart());
                        order.placeOrder();
                        orderQueue.addAll(cart.getCart());
                        System.out.println("Order added to queue");
                        break;

                    case 5:
                        System.exit(0);
                }

            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
