public class Main {
    static void main(String[] args) {
        String message = "This is a test message";

        // 1. Messsage từ SMS + Email
        System.out.println("1. Gửi thông báo (SMS + Email): ");
        Notifier smsNotifier = new SMSNotifier(new EmailNotifier());
        smsNotifier.send(message);

        // 2. Messsage từ Facebook + Email
        System.out.println("2. Gửi thông báo (Facebook + Email): ");
        Notifier facebookNotifier = new FacebookNotifier(new EmailNotifier());
        facebookNotifier.send(message);

        // 1. Messsage từ Email + SMS + Facebook
        System.out.println("3. Gửi thông báo (chỉ bằng SMS): ");
        Notifier defaultNotifier = new FacebookNotifier(new SMSNotifier(new EmailNotifier()));
        defaultNotifier.send(message);

    }
}
