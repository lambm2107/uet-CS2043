class Employee extends Person{
    double salary;
    Employee() {
        super("Hàm này dùng để bổ sung vào tham số của constructor của Person");
        System.out.println("2. Employee is created");
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
