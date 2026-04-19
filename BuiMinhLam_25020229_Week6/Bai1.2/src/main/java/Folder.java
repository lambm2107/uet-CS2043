import java.util.ArrayList;
import java.util.List;

class Folder extends FileSystemItem {
    private List<FileSystemItem> child = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(FileSystemItem item) {
        item.parent = this;
        child.add(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystemItem item : child) {
            item.print(indent + "  ");
        }
    }
}