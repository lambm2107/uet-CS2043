import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đây là phần của Singleton
        System.out.println("----1. SINGLETON----");
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        System.out.println(log1.hashCode());
        System.out.println(log2.hashCode());
        if (log1.hashCode() == log2.hashCode()) {
            System.out.println("Hai biến trỏ vào cùng 1 bộ nhớ");
        } else {
            System.out.println("Fail rồi");
        }

        // Đây là phần của Factory
        System.out.println("----2. FACTORY----");
        System.out.print("Hãy nhập loại file: ");
        String fileType = sc.nextLine();
        Export file = ExportFactory.createFile(fileType);
        file.exportData("Không có nội dung gì hết");

        // Đây là phần của Adapter
        System.out.println("----3. ADAPTER----");
        OldPlayer oldPlayer = new OldPlayer("MP3");
        AdapterPlayer newPlayer = new AdapterPlayer(oldPlayer);
        oldPlayer.playFile("MP3");
        System.out.print("=> ");
        newPlayer.play("Spotify");

        // Đây là phần của Prototype
        System.out.println("----4. PROTOTYPE----");
        Config origin = new Config("1.1.1.1");
        Config copy = origin.clone();
        copy.setModule("8.8.8.8");
        System.out.println("Origin: " + origin.getModule());
        System.out.println("Copy: " + copy.getModule());
    }
}
