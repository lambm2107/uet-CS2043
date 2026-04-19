public class Tester extends Employee {
    private int bugsFound;

    public Tester(String name, double baseSalary, int bugsFound) {
        super(name, baseSalary);
        this.bugsFound = bugsFound;
    }

    public int getBugsFound() {
        return bugsFound;
    }

    public void setBugsFound(int bugsFound) {
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.10 + (bugsFound * 50000);
    }
}
