public class OfficerWorker extends Employee{
    public OfficerWorker(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return getBaseSalary();
    }

    @Override
    public void work() {
        System.out.println("Soạn thảo văn bản");
    }

    @Override
    public void display() {
        System.out.println(getName() + " - Pay: " + calculatePay());
        System.out.println("Soạn thảo văn bản\n");
    }

}
