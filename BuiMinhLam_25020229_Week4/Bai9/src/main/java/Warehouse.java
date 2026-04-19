import java.util.ArrayList;

public class Warehouse<T extends Product> {
    private ArrayList<T> items;

    public Warehouse() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void print() {
        for (T i: items) {
            System.out.println(i.toString());
        }
    }
}
