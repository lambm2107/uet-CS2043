public class Employee {
    private String name;
    private MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = new MyDate(birthday);
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.birthday = new MyDate(other.birthday);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = new MyDate(birthday); // vẫn giữ deep copy
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Ngày sinh: " + birthday;
    }

    public static void main(String[] args) {

        MyDate date1 = new MyDate(1, 1, 2000);
        Employee emp1 = new Employee("Nguyễn Văn A", date1);

        Employee emp2 = new Employee(emp1);

        System.out.println("Trước khi thay đổi: ");
        System.out.println("emp1: " + emp1.getBirthday());
        System.out.println("emp2: " + emp2.getBirthday());


        emp1.getBirthday().setDay(2);
        emp1.getBirthday().setMonth(2);
        emp1.getBirthday().setYear(2022);

        System.out.println("Sau khi thay đổi: ");
        System.out.println("emp1: " + emp1.getBirthday());
        System.out.println("emp2: " + emp2.getBirthday());

        System.out.println("\nNgày sinh của emp2: " + emp2.getBirthday());
    }
}