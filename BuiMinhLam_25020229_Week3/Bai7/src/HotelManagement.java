import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int nights = sc.nextInt();

        Room room;

        if (type.equals("S")) {
            room = new StandardRoom(nights);
        } else {
            room = new VipRoom(nights);
        }

        System.out.println((long)room.calculatePrice());
    }
}