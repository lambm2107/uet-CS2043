public class Book extends MediaItem{
    private int numberPage;

    public Book(String id, String name, String author, int numberPage) {
        super(id, name, author);
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return getName() + " - " + getAuthor() + " - " + numberPage;
    }
}
