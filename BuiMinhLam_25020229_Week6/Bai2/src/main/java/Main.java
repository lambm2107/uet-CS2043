public class Main {
    public static void main(String[] args) {
        NotificationApp emailApp = new EmailApp();
        emailApp.notifyUser("This is a test email.");
        NotificationApp smsApp = new SmsApp();
        smsApp.notifyUser("This is a SMS test.");
    }
}
