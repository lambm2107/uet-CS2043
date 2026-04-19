import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class LibrarySystem {
    List<Book> bookList = new ArrayList<>();
    HashMap<String, Book> idBookList = new HashMap<>();
    TreeMap<String, Book> bookList_sorted = new TreeMap<>();

    public void addBook(Book book) {
        bookList.add(book);
        idBookList.put(book.getId(), book);
        bookList_sorted.put(book.getId(), book);
    }

    public void findBookById(String id) {
        Book foundBook = idBookList.get(id);
        if (foundBook != null) {
            System.out.println("Sách bạn cần tìm: " + foundBook.toString());

        } else {
            System.out.println("Không tìm thấy sách!");
        }
    }
    public void removeBookById(String id) {
        Book deleteBook = idBookList.remove(id);
        if (deleteBook != null) {
            bookList_sorted.remove(id);
            System.out.println("Đã xóa thông tin sách!");
        } else {
            System.out.println("Không tìm thấy sách!");
        }

    }

    public void displayBookList() {
        bookList_sorted.forEach((key, value) -> {
            System.out.println(value.toString());
        });
    }


}
