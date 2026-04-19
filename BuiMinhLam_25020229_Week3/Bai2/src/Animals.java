public class Animals {
    public void makeSound() {
        System.out.println("Animals sound");
    }

    static void main(String[] args) {
        Animals []zoo = new Animals[4];
        zoo[0] = new Dog();
        zoo[1] = new Cat();
        zoo[2] = new Duck();
        zoo[3] = new Dog();
        for (Animals z: zoo) {
            z.makeSound();
        }
    }
}
