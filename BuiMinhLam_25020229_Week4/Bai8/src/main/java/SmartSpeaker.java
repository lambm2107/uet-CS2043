public class SmartSpeaker extends Device implements WifiConnectable{
    public SmartSpeaker(String type, String id, String name) {
        super(type, id, name);
    }

    @Override
    public void connectWifi() {
        System.out.println(getName() + " connected to wifi");
    }

//    @Override
//    public void turnOff() {
//        setMode(false);
//        System.out.println(getName() + " is turned off");
//    }
}

