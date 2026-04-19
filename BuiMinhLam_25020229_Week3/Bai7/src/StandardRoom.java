public class StandardRoom extends Room {

    private static final double PRICE_PER_NIGHT = 500000;

    public StandardRoom(int nights) {
        super(nights);
    }

    @Override
    public double calculatePrice() {
        double total = nights * PRICE_PER_NIGHT;

        if (nights > 3) {
            total *= 0.95; // giảm 5%
        }

        return total;
    }
}