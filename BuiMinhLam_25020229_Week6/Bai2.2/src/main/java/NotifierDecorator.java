public abstract class NotifierDecorator implements Notifier{
    private Notifier wrapper;

    public NotifierDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void send(String msg) {
        wrapper.send(msg);
    }
}
