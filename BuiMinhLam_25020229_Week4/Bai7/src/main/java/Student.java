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

    public Student(String id, String name, double GPA) {
        this.id = id;
        this.name = name;
        setGPA(GPA);
    }

    public Student(String id, String name, String email, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        setGPA(GPA);
    }



    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.GPA;
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

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


}
