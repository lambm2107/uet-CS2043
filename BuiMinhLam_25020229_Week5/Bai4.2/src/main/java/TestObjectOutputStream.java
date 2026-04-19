import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class TestObjectOutputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        Student[] student = {};


        try {
            FileOutputStream fout = new FileOutputStream("input.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            while (true) {
                line = sc.nextLine();
                if (line.equalsIgnoreCase("END"))
                    break;
                String[] part = line.split(",");
                out.writeObject(new Student(part[0].trim(), part[1].trim(), Double.parseDouble(part[2].trim())));
            }

            out.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Chương trình đã chạy thành công!");
            sc.close();
        }

    }
}
