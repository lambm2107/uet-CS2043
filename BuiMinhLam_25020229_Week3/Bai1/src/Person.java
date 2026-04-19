class Person {
    String name;
    String dob;

    Person(String name) {
        System.out.println("1. Person is created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public String getDob() {
        return this.dob;
    }

    public static void main(String[] args) {
        Manager m = new Manager();
    }

}


