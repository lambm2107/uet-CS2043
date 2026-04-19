public class Adventure {
    public static void f(CanFight cf) {
        cf.fight();
    }

    public static void fl(CanFly cfl) {
        cfl.fly();
    }

    public static void s(CanSwim sw) {
        sw.swim();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        s(h);
        f(h);

    }
}
