import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class TestDataOutputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (DataInputStream dis = new DataInputStream(new FileInputStream("number.dat"))) {
            // Lặp vô hạn, vòng lặp sẽ bị phá vỡ khi bắt được EOFException
            while (true) {
                int number = dis.readInt();
                System.out.print(number + " ");
            }
        } catch (EOFException e) {
            continue;
        } catch (IOException e) {
            System.out.println("Lỗi I/O trong quá trình đọc tệp.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}