import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UIFactory factory = null;
        System.out.print("Nhập định dạng bạn muốn xuất ra: ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("win")) {
            factory = new WindowsFactory();

        } else if (input.equalsIgnoreCase("mac")) {
            factory = new MacFactory();
        }

        Factory fac = new Factory(factory);
        fac.render();
    }
}
