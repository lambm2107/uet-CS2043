public class Person {
    private String name;
    private Person me;

    public Person(String name) {
        this.name = name;
    }

    public void setMe(Person other) {
        this.me = other;
    }

    public Person getMe() {
        return this.me;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng Person và gán cho biến p
        Person p = new Person("Lâm");

        // Set tham chiếu me đến chính đối tượng mà p đang trỏ tới
        p.setMe(p);

        // Truy cập và in getName() thông qua biến tham chiếu me
        System.out.println("Name qua me: " + p.getMe().getName());

        p = null;
    }
}