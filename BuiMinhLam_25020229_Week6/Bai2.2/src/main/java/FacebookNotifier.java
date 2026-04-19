public class FacebookNotifier extends NotifierDecorator{
    public FacebookNotifier(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("This is a message from Facebook: " + msg);
    }
}
