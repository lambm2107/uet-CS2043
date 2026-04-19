public abstract class NotificationApp{
    abstract Notification createNotification();

    void notifyUser(String msg) {
        Notification notification = createNotification();
        notification.send(msg);
    }

}
