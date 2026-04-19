public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // phương thức tính lương (đa hình)
    public abstract double calculateSalary();

    // loại nhân viên
    public abstract String getType();
}