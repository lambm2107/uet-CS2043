public class SmsApp extends NotificationApp{
    @Override
    Notification createNotification() {
        return new SmsNotification();
    }

}
