import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Source path: ");
        String sourcePath = sc.nextLine();

        Map<String, String> configList = new HashMap<>();
        BufferedReader reader = null;

        try {
            String line;
            reader = new BufferedReader(new FileReader(sourcePath));
            while ((line = reader.readLine())!= null) {
                String[] part = line.split("=");
                String key = part[0].trim();
                String value = part[1].trim();
                configList.put(key, value);
            }

            if (!configList.containsKey("username") || !configList.containsKey("timeout")) {
                throw new InvalidConfigException("Thiếu 'username' hoặc 'timeout' trong file cấu hình.");
            }

            int timeout = Integer.parseInt(configList.get("timeout"));
            if (timeout <= 0) {
                throw new InvalidConfigException("Đầu vào timeout không hợp lệ.");
            }

            int maxConnections = Integer.parseInt(configList.get("maxConnections"));
            if (maxConnections < 1) {
                throw new InvalidConfigException("Đầu vào maxConnection không hợp lệ.");
            }

            System.out.println("\n--- Thông tin cấu hình ---");
            for (Map.Entry<String, String> list : configList.entrySet()) {
                System.out.println(list.getKey() + "=" + list.getValue());
            }
            System.out.println("Config được load thành công.");
        } catch (FileNotFoundException e) {
            System.out.println("Config file not found");
        } catch (IOException e){
            System.out.println("I/O error");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (InvalidConfigException e) {
            System.out.println("Invalid config: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program finished");
        }
    }

}
