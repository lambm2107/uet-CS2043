public class AppConfig {
    private static AppConfig instance;

    private String appName;
    private String version;
    private int logLevel;

    // Đảm bảo an toàn đa luồng
    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }




}
