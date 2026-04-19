import java.util.*;

public class Main {
    static String standardization(String s) {
        s = s.trim().replaceAll("\\s+", " ");          // Xóa khoảng trắng thừa
        s = s.replaceAll("[^\\p{L}\\p{N}\\s]", "");    // Xóa các ký tự đặc biệt
        s = s.toLowerCase();                                            // Chuyển về chữ thường
        return s;
    }

    static HashMap<String, Integer> splitString(String s) {
        HashMap<String, Integer> countWord = new HashMap<String, Integer>();
        String[] words = s.split(" ");
        for (String i: words) {
            if (countWord.containsKey(i)) {
                countWord.put(i, countWord.get(i)+1);
            } else {
                countWord.put(i, 1);
            }
        }
        return countWord;
    }

    static void countAndSearch(HashMap<String, Integer> wordList) {
        List<String> oneWord = new ArrayList<>();
        int maxWord = -1;
        for (String key: wordList.keySet()) {
            if (maxWord < wordList.get(key)) {
                maxWord = wordList.get(key);
            }
            if (wordList.get(key) == 1) {
                oneWord.add(key);
            }
        }
        System.out.println("Từ xuất hiện nhiều nhất: " + maxWord);
        System.out.print("Những từ xuât hiện 1 lần:\n [" );
        oneWord.forEach(item -> System.out.print(item + " "));
        System.out.print("]");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = standardization(s);
        HashMap<String, Integer> wordList = splitString(s);
        System.out.println(s);
        countAndSearch(wordList);
    }
}

