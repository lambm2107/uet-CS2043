import java.io.*;
import java.util.Scanner;

public class TestDataInputStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("number.dat"))) {
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                dos.writeInt(number); 
            }
        } catch (IOException e) {
            System.out.println("Lỗi I/O trong quá trình ghi tệp.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}