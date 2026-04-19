public abstract class ActionCharacter implements CanSwim, CanFight, CanFly{
    @Override
    public void fight() {
        System.out.println("Đấm bốc...");
    }
}
