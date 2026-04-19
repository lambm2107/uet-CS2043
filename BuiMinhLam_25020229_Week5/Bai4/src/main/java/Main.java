import java.util.HashMap;
import java.util.Map;

public class Main {
    private Map<String, Integer> word = new HashMap<>();

    public void analyze(String text) {
        String lowerText = text.toLowerCase().replaceAll("[,.]", "");
        String[] part = lowerText.split("\\s+");

        for (String w : part) {
            if (w.isEmpty()) {
                continue;
            }

            if (word.containsKey(w)) {
                word.put(w, word.get(w) + 1);
            } else {
                word.put(w, 1);
            }
        }
    }

    public void displayResult() {
        System.out.println("List of the words appearing in the text:");

        String maxWord = null;
        int maxCount = 0;

        // In ra danh sách và đồng thời tìm từ xuất hiện nhiều nhất
        for (Map.Entry<String, Integer> entry : word.entrySet()) {
            String currentWord = entry.getKey();
            int currentCount = entry.getValue();

            System.out.println(currentWord + ": " + currentCount);

            // Cập nhật từ có số lần xuất hiện nhiều nhất
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxWord = currentWord;
            }
        }

        if (maxWord != null) {
            System.out.println("Max number: " + maxWord + " - " + maxCount + " times.");
        }
    }

    // Hàm main để chạy thử nghiệm với dữ liệu đầu vào của đề bài
    public static void main(String[] args) {
        Main counter = new Main();
        String inputData = "Hello world. This is a java program. Hello java, hello world.";

        counter.analyze(inputData);
        counter.displayResult();
    }
}