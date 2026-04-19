import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Robot> robotList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(" ");

            String type = parts[0];
            int id = Integer.parseInt(parts[1]);
            String modelName = parts[2];

            if (type.equals("DR")) {
                robotList.add(new DroneRobot(id, modelName));
            } else if (type.equals("FR")) {
                robotList.add(new FishRobot(id, modelName));
            } else if (type.equals("AR")) {
                robotList.add(new AmphibiousRobot(id, modelName));
            }
        }

        // Duyệt danh sách, gọi performMainTask() và kiểm tra kỹ năng bằng instanceof
        for (Robot robot : robotList) {
            robot.performMainTask();

            if (robot instanceof Flyable) {
                ((Flyable) robot).fly();
            }
            if (robot instanceof Swimmable) {
                ((Swimmable) robot).swim();
            }
            if (robot instanceof GPS) {
                ((GPS) robot).getCoordinates();
            }

            System.out.println();
        }

        scanner.close();
    }
}
