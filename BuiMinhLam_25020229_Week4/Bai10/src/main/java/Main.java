import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static LibrarySection<Book> bookList = new LibrarySection<>();
    static LibrarySection<DVD> dvdList = new LibrarySection<>();
    static Scanner sc = new Scanner(System.in);

    static void add() {
        String line = sc.nextLine();
        String[] part = line.split(" ");
        String type = part[0];
        String id = part[1];
        String name = part[2];
        String author = part[3];

        if (type.equals("B")) {
            Integer pageNumber = Integer.parseInt(part[4]);
            bookList.add(new Book(id, name, author, pageNumber));
        }

        if (type.equals("D")) {
            Double duration = Double.parseDouble(part[4]);
            dvdList.add(new DVD(id, name, author, duration));
        }
    }

    static void remove() {
        System.out.print("Nhập ID bạn muốn loại bỏ: ");
        String id = sc.nextLine();
        bookList.remove(id);
        dvdList.remove(id);
    }

    static void firstInput() {
        Integer n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            add();
        }
    }

    static void display() {
        boolean running = true;
        firstInput();
        while (running) {
            System.out.println("1. Thêm sách / DVD");
            System.out.println("2. Bỏ sách / DVD (theo ID)");
            System.out.println("3. Xuất danh sách");
            System.out.print("Nhập lựa chọn của bạn: ");
            Integer choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:         // Thêm vào danh sách
                    System.out.print("Hãy thêm sách/DVD: ");
                    add();
                    break;
                case 2:         // Bỏ khỏi danh sách
                    remove();
                    break;
                case 3:
                    System.out.println("Khu vực sách: ");
                    bookList.print();

                    System.out.println("Khu vực DVD: ");
                    dvdList.print();
                    break;

            }
            System.out.print("Bạn có muốn tiếp tục không? Y/N: ");
            String ask = sc.nextLine();
            if (ask.equalsIgnoreCase("N")) {
                running = false;
                System.out.println("Goodbye!");
            }
        }
    }

    static void main(String[] args) {

        display();



    }
}
