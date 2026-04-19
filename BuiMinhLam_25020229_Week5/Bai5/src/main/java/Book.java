public class Book {
    private String id;
    private String title;
    private String author;
    private String year;
    public Book(String id, String title, String author, String year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + author + " - " + year;
    }
}
