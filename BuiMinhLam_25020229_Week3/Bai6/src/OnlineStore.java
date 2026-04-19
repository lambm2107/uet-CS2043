import java.util.*;
import java.time.LocalDate;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Order order = new Order();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            // Tách dữ liệu có dấu ""
            String type = line.substring(0, 1);
            String name = line.split("\"")[1];
            String rest = line.substring(line.lastIndexOf("\"") + 1).trim();

            String[] parts = rest.split(" ");

            if (type.equals("E")) {
                double price = Double.parseDouble(parts[0]);
                double warranty = Double.parseDouble(parts[1]);
                order.addProduct(new Electronics(name, price, warranty));
            } else if (type.equals("F")) {
                double price = Double.parseDouble(parts[0]);
                LocalDate date = LocalDate.parse(parts[1]);
                order.addProduct(new Food(name, price, date));
            }
        }

        order.printOrder();
    }
}