import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        Warehouse<Food> foodWarehouse = new Warehouse<>();
        Warehouse<Electronic> electronicWarehouse = new Warehouse<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] part = line.split(" ");
            String type = part[0];
            String id = part[1];
            String name = part[2];

            if (type.equals("F")) {
                LocalDate dateExpired = LocalDate.parse(part[3]);
                foodWarehouse.add(new Food(id, name, dateExpired));
            }

            if (type.equals("E")) {
                int dateWarranty = Integer.parseInt(part[3]);
                electronicWarehouse.add(new Electronic(id, name, dateWarranty));
            }


        }

        System.out.println("Kho thực phẩm: ");
        foodWarehouse.print();

        System.out.println("Kho điện tử: ");
        electronicWarehouse.print();

    }
}
