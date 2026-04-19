public class Animals {
    public void makeSound() {
        System.out.println("Animals sound");
    }

    static void main(String[] args) {
        Animals a = new Dog();
        if (a instanceof Cat) {
            a.makeSound();
        } else {
            System.out.println("Đây không phải là Mèo!");
        }

    }

}
