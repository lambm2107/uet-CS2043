import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] part = line.split(" ");

            String type = part[0];
            String id = part[1];
            String name = part[2];
            double baseSalary = Double.parseDouble(part[3]);

            if (type.equalsIgnoreCase("O")) {
                employees.add(new OfficerWorker(id, name, baseSalary));
            }

            if (type.equalsIgnoreCase("T")) {
                double overtimes = Double.parseDouble(part[4]);
                employees.add(new Technician(id, name, baseSalary, overtimes));
            }
        }

        System.out.println("\nOutput:");
        for (Employee e: employees) {
            e.display();
        }
    }
}
