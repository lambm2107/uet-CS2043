public class SmartLight extends Device implements Adjustable{
    public SmartLight(String type, String id, String name) {
        super(type, id, name);
    }

//    @Override
//    public void turnOff() {
//        setMode(false);
//        System.out.println(getName() + " is turned off");
//    }
}
