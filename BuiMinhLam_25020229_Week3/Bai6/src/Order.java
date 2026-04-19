import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getFinalPrice();
        }
        return sum;
    }

    public void printOrder() {
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Total = " + getTotal());
    }
}