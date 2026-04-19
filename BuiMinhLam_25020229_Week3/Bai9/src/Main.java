import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<IPayable> payableList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(" ");

            if (parts[0].equals("S")) {
                // PartTimeStaff: S [id] [name] [workingHours] [hourlyRate]
                String id = parts[1];
                String name = parts[2];
                int workingHours = Integer.parseInt(parts[3]);
                double hourlyRate = Double.parseDouble(parts[4]);
                payableList.add(new PartTimeStaff(id, name, workingHours, hourlyRate));

            } else if (parts[0].equals("I")) {
                // Invoice: I [itemName] [quantity] [pricePerItem]
                String itemName = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                double pricePerItem = Double.parseDouble(parts[3]);
                payableList.add(new Invoice(itemName, quantity, pricePerItem));
            }
        }

        double total = 0;
        for (IPayable p : payableList) {
            System.out.println(p);
            total += p.getPaymentAmount();
        }

        System.out.println("Total Payment = " + total);

        scanner.close();
    }
}
