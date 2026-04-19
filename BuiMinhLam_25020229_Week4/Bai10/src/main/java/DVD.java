public class DVD extends MediaItem {
    private double duration;

    public DVD(String id, String name, String author, double duration) {
        super(id, name, author);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return getName() + " - " + getAuthor() + " - " + duration;
    }
}
