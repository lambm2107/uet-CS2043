public class Student {

    private String id;
    private String name;
    private String email;
    private double GPA;

    public Student() {
        this.id = "";
        this.name = "";
        this.email = "";
        this.GPA = 0;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.email = "";
        this.GPA = 0;
    }

    public Student(String id, String name, String email, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        setGPA(GPA);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getGPA() {
        return GPA;
    }

    public void setId(String studentId) {
        this.id = studentId;
    }

    public void setName(String studentName) {
        this.name = studentName;
    }

    public void setEmail(String studentEmail) {
        this.email = studentEmail;
    }

    public void setGPA(double studentGPA) {
        if (0.0 <= studentGPA && studentGPA <= 4.0)
            this.GPA = studentGPA;
        else
            System.out.println("GPA khong hop le!");
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", GPA: " + GPA);
    }

    public static void main(String[] args) {
        Student s1 = new Student();                  // Không có tham số
        Student s2 = new Student("S01", "An");
        Student s3 = new Student("S02", "Binh", "binh@gmail.com", -3.6);

        System.out.print("Học sinh thứ nhất: ");
        s1.printInfo();
        System.out.print("Học sinh thứ hai: ");
        s2.printInfo();
        System.out.print("Học sinh thứ ba: ");
        s3.printInfo();
    }
}
