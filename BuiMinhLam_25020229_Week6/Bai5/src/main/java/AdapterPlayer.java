public class AdapterPlayer implements Player{
    private OldPlayer oldPlayer;

    public AdapterPlayer(OldPlayer oldPlayer) {
        this.oldPlayer = oldPlayer;
    }

    @Override
    public void play(String name) {
        System.out.println(name + " is playing ");
    }
}
