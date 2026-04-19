public class Main {
    static void main() {
        AppConfig ac1 = AppConfig.getInstance();
        AppConfig ac2 = AppConfig.getInstance();

        // Gọi hashCode -> Chứng minh tính static của getInstance
        System.out.println("AppConfig - 1 - hashCode: " + ac1.hashCode());
        System.out.println("AppConfig - 2 - hashCode: " + ac1.hashCode());
    }
}
