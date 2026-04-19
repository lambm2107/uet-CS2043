import java.io.*;
import java.util.Scanner;

public class TestObjectInputStream {
    public static void main(String[] args) {
        Student s;
        Scanner sc = new Scanner(System.in);

        try {
            FileInputStream fin = new FileInputStream("input.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            while (true) {
                s = (Student) in.readObject();
                System.out.println(s.toString());
            }
        }
        catch (EOFException e) {
            System.out.println("Không còn dữ liệu!");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Không thể tạo đối tượng");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Chương trình đã chạy thành công!");
            sc.close();
        }
    }
}
