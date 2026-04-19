import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("Nhập số không hợp lệ!");
        } catch (ArithmeticException e) {
            System.out.println("Không được nhập b bằng 0!");
        } finally {
            System.out.print("Program finished!");
        }
    }
}
