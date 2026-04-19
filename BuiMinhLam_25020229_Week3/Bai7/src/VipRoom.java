public class VipRoom extends Room {

    private static final double PRICE_PER_NIGHT = 2000000;

    public VipRoom(int nights) {
        super(nights);
    }

    @Override
    public double calculatePrice() {
        return nights * PRICE_PER_NIGHT; // không giảm
    }
}