import java.util.ArrayList;

public class LibrarySection<T extends MediaItem> {
    private ArrayList<T> items;

    public LibrarySection() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void remove(String id) {
        items.removeIf(item -> item.getId().equals(id));
    }

    public void print() {
        for (T i: items) {
            System.out.println(i.toString());
        }
    }

}
