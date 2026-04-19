public class EmailNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("Gửi email: " + msg);
    }
}
