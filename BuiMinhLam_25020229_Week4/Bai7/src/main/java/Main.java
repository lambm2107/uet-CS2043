import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void removingGPA(List<Student> student) {
        student.removeIf(s -> s.getGPA() < 5.0);
        System.out.println("After removing GPA < 5.0: ");
        for (Student i: student) {
            System.out.println(i.toString());
        }
    }

    public static void sortingName(List<Student> student) {
        student.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorting by name: ");
        for (Student i: student) {
            System.out.println(i.toString());
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        List<Student> student = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] part = line.split(" ");

            String id = part[0];
            String name = part[1];
            double GPA = Double.parseDouble(part[2]);

            student.add(new Student(id, name, GPA));
        }

        removingGPA(student);
        sortingName(student);

        Operation<Double> add = (s1, s2) -> s1 + s2;
        Operation<Double> sub = (s1, s2) -> s1 - s2;
        Operation<Double> mul = (s1, s2) -> s1 * s2;
        Operation<Double> div = (s1, s2) -> s1 / s2;
    }
}
