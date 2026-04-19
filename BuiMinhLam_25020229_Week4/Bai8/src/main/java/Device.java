public abstract class Device {
    private String type;
    private String id;
    private String name;
    private boolean mode;

    public Device(String type, String id, String name) {
        this.type = type;
        this.id = id;
        this.name = name;
    }

    public Device(String type, String id, String name, boolean mode) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.mode = false;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getMode() {
        return mode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }

    public void turnOn() {
        mode = true;
        System.out.println(name + " turned on");
    }

    public void turnOff() {
        mode = false;
        System.out.println(name + " turned off");
    }

}
