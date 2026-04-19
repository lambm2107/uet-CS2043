import java.util.*;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            // Tách phần tên trong dấu ""
            int firstQuote = line.indexOf("\"");
            int lastQuote = line.lastIndexOf("\"");

            String type = line.substring(0, 1); // F hoặc P
            String name = line.substring(firstQuote + 1, lastQuote);

            String[] parts = line.substring(lastQuote + 1).trim().split(" ");

            if (type.equals("F")) {
                double baseSalary = Double.parseDouble(parts[0]);
                double bonus = Double.parseDouble(parts[1]);
                double penalty = Double.parseDouble(parts[2]);

                employees[i] = new FullTimeEmployee(name, baseSalary, bonus, penalty);
            } else if (type.equals("P")) {
                double workingHours = Double.parseDouble(parts[0]);
                double hourlyRate = Double.parseDouble(parts[1]);
                employees[i] = new PartTimeEmployee(name, workingHours, hourlyRate);
            }
        }


        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getType() + " - " + e.calculateSalary());
        }

    }
}