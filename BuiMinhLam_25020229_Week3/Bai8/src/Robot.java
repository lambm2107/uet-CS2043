public abstract class Robot {
    private int id;
    private String modelName;
    private int batteryLevel;

    public Robot(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
        this.batteryLevel = 0;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void chargeBattery() {
        this.batteryLevel = 100;
    }

    public final void showIdentity() {
        System.out.println("ID: " + id + ", Model: " + modelName);
    }

    public abstract void performMainTask();
}
