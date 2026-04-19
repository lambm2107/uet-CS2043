import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static LibrarySystem librarySystem = new LibrarySystem();
//    List<Book> bookList = new ArrayList<>();
//    HashMap<String, Book> idBookList = new HashMap<>();
//    TreeMap<String, Book> idBookList_sorted = new TreeMap<>();

    public static void bookInfo() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        String year = sc.nextLine();
        librarySystem.addBook(new Book(id, title, author, year));
    }

    public static void display() {
        System.out.println("==Chào mừng đến với chương trình quản lý thư viện==");
        boolean running = true;
        while (running) {
            try {
                System.out.println("1. Thêm sách");
                System.out.println("2. Tìm sách (theo id)");
                System.out.println("3. Xóa sách (theo id)");
                System.out.println("4. In danh sách sách");
                System.out.print("Nhập lựa chọn của bạn: ");
                int choose = sc.nextInt();
                sc.nextLine();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập thông tin sách: ");
                        bookInfo();
                        break;
                    case 2:
                        System.out.print("Nhập id sách: ");
                        String id_find = sc.nextLine();
                        librarySystem.findBookById(id_find);
                        break;
                    case 3:
                        System.out.print("Nhập id sách: ");
                        String id_del = sc.nextLine();
                        librarySystem.removeBookById(id_del);
                        break;
                    case 4:
                        librarySystem.displayBookList();
                        break;
                    default:
                        System.out.print("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4.\n");
                        break;
                }
                if (choose >= 1 && choose <= 4) {
                    System.out.print("Bạn có muốn tiếp tục không? Y/N: ");
                    String continueQuestion = sc.nextLine();
                    while (!continueQuestion.equalsIgnoreCase("Y") && !continueQuestion.equalsIgnoreCase("N")) {
                        System.out.print("Nhập lại (Y/N): ");
                        continueQuestion = sc.nextLine();
                    }
                    if (continueQuestion.equalsIgnoreCase("N")) {
                        running = false;
                        System.out.print("Tạm biệt!");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhập không đúng định dạng!");
                sc.nextLine();
            }
        }
    }



    static void main(String[] args) {
        librarySystem.addBook(new Book("N001", "Killing the Mockingbird", "Harper Lee", "1960"));
        librarySystem.addBook(new Book("MN001", "Harry Potter and the Philsopher Stone", "J.K.Rowling", "1997"));
        librarySystem.addBook(new Book("MN002", "Harry Potter and the Secret Chamber", "J.K.Rowling", "1997"));
        librarySystem.addBook(new Book("MN003", "Harry Potter and the Prisoner of Azkaban", "J.K.Rowling", "1997"));
        librarySystem.addBook(new Book("MN004", "Harry Potter and the Goblet of Fire", "J.K.Rowling", "1997"));

        display();
    }
}
