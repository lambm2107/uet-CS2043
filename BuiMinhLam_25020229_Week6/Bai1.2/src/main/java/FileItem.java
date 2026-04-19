public class FileItem extends FileSystemItem{
    private int size;

    public FileItem(String name, int size) {
        super(name);
        this.size = size;
    }

    void print() {
        System.out.println("File: " + name + " ("+ size + "KB)");
    }

    @Override
    void print(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + "KB)");
    }
}
