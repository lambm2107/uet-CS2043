public class Technician extends Employee{
    private double overtimeHours;

    public Technician(String id, String name, double baseSalary, double overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + overtimeHours * 20000;
    }

    @Override
    public void work() {
        System.out.println("Lắp đặt thiết bị");
    }

    @Override
    public void display() {
        System.out.println(getName() + " - Pay: " + calculatePay());
        System.out.println("Lắp đặt thiết bị\n");
    }
}
