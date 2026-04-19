public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;      // obj = null -> không thể so sánh || đảm bảo hai obj cùng kiểu dữ liệu
        Book other = (Book) obj;                                            // Ép kiểu obj về kiểu dữ liệu Book
        return this.price == other.price &&
                this.title.equals(other.title) &&                           // String là object
                this.author.equals(other.author);                           // == chỉ so sánh địa chỉ, không so sánh nội dung
    }

    public static void main(String[] args) {
        Book book1 = new Book("Sans Famillie", "Hector Malot", 45);
        Book book2 = new Book("Killing the Mockingbird", "Harper Lee", 89);

        if (book1.equals(book2)) {
            System.out.println("Hai quyển sách giống nhau");
        } else {
            System.out.println("Hai quyển sách khác nhau");
        }
    }

}