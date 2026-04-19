public class Main {
    static long useString() {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "Hello";
        }
        return System.currentTimeMillis();
    }

    static long useStringBuffer() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            s.append("Hello");
        }
        return System.currentTimeMillis();
    }

    static void contentAnalysis() {
        String s1 = "UETe.DayJava?Daudauqua!";
        StringBuffer s2 = new StringBuffer("UETe.DayJava?Daudauqua!");

        // Dùng String để xử lý
        String regex = "[.\\?\\!]";
        String[] part = s1.split(regex);
        System.out.println(part.length);

        System.out.println(s1.replace("Java", "Python"));

        // Dùng StringBuffer để xử lý
        boolean check = false;
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                if (!check) {
                    count++;
                    check = true; // Đánh dấu để không đếm các dấu câu liên tiếp
                }
            } else if (!Character.isWhitespace(c)) {
                // Nếu gặp một ký tự chữ/số bình thường, reset lại cờ
                check = false;
            }
        }
        System.out.println(count);

        while (s2.indexOf("Java") != -1) {
            s2.replace(s2.indexOf("Java"), s2.indexOf("Java") + 4, "Python");
        }
        System.out.println(s2);

    }

    public static void main(String[] args) {
        System.out.println(useString());
        System.out.println(useStringBuffer());
        contentAnalysis();
    }
}
