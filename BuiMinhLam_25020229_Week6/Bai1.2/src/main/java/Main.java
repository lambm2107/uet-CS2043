public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");   // Thư mục gốc

        Folder docs = new Folder("docs");
        FileItem file1 = new FileItem("a.txt", 12);
        FileItem file2 = new FileItem("b.txt", 8);
        docs.add(file1);
        docs.add(file2);
        Shortcut shortcut = new Shortcut("a-shortcut", file1);
        docs.add(shortcut);


        root.add(docs);
        root.add(new FileItem("readme.md", 4));
        root.print("");
    }
}