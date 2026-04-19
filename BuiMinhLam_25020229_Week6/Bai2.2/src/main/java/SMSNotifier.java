public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("This is a message from SMS: " + msg);
    }
}
