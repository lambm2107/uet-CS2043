public class EmailApp extends NotificationApp{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
