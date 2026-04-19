abstract class FileSystemItem {
    String name;
    Folder parent;

    public FileSystemItem(String name) {
        this.name = name;
    }

    abstract void print(String indent);

    public String getPath() {
        if (parent == null) {
            return "/" + name;
        }
        return parent.getPath() + "/" + name;
    }
}
