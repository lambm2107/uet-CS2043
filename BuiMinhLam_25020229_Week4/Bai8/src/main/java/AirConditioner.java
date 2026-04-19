public class AirConditioner extends Device implements WifiConnectable{
    public AirConditioner(String type, String id, String name) {
        super(type, id, name);
    }

    @Override
    public void connectWifi() {
        System.out.println(getName() + " connected to wifi");
    }
}
