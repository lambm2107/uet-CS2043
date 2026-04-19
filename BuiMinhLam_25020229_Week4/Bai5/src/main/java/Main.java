public class Main {
    static void main(String[] args) {
        Pair<String, Integer> age = new Pair<>("Tuổi", 20);
        Pair<String, String> idStudent = new Pair<>("Mã SV", "SV001");
        Pair<Integer, Double> coordinate = new Pair<>(105, 21.5);

        // age.setKey(20);
        // Error: java: incompatible types: int cannot be converted to java.lang.String

        System.out.println(age.toString());

    }
}
