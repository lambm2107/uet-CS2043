import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Source path: ");
        String sourcePath = sc.nextLine();

        System.out.println("Destination path: ");
        String destinationPath = sc.nextLine();

        BufferedReader reader = null;
        PrintWriter writer = null;
        boolean checkOpenedSource = false;

        try {
            reader = new BufferedReader(new FileReader(sourcePath));
            writer = new PrintWriter(new FileWriter(destinationPath));
            checkOpenedSource = true;

            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                writer.println(line);
                lineCount++;
            }

            System.out.println("Sao chép thành công! Số dòng đã sao chép: " + lineCount);

        } catch (FileNotFoundException e) {
            if (!checkOpenedSource)
                System.out.println("File not found!");
            else
                System.out.println("Cannot created destination file!");
        } catch (IOException e) {
            System.out.println("I/O error");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Lỗi khi đóng tệp nguồn");
            }

            if (writer != null) {
                writer.close();
            }
        }

        sc.close();

    }
}
