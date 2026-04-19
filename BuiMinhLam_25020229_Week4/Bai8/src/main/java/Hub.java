import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hub {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Device> devices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] part = line.split(" ");
            String type = part[0];
            String id = part[1];
            String name = part[2];

            Device device = null;

            switch (type){
                case "L":
                    device = new SmartLight(type, id, name);
                    break;
                case "AC":
                    device = new AirConditioner(type, id, name);
                    break;
                case "S":
                    device = new SmartSpeaker(type, id, name);
                    break;
                case "C":
                    device = new AutomaticCurtain(type, id, name);
                    break;
            }

            devices.add(device);
        }

        System.out.println("Turn off all devices:");
        for (Device device: devices) {
            device.turnOff();
        }

        System.out.println("Setup Wifi:");
        for (Device device: devices) {
            if (device instanceof WifiConnectable) {
                ((WifiConnectable) device).connectWifi();
            }
        }

    }
}
