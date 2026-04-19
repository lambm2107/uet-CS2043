public class Inventory {
    Product[] items;

    public Inventory(Product[] initialItems) {
        this.items = initialItems;
    }

    public void display() {
        for (Product p : items) {
            System.out.println(p);
        }
    }
}