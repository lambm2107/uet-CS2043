import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {
    private LocalDate expiryDate;

    public Food(String name, double price, LocalDate expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getFinalPrice() {
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(today, expiryDate);

        if (days < 7) {
            return price * 0.8; // giảm 20%
        }
        return price;
    }

    @Override
    public String toString() {
        return name + " - Food - " + getFinalPrice();
    }
}