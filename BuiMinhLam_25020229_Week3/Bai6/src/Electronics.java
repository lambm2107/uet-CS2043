public class Electronics extends Product {
    private double warrantyFee;

    public Electronics(String name, double price, double warrantyFee) {
        super(name, price);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public double getFinalPrice() {
        return price * 1.1 + warrantyFee; // VAT 10% + bảo hành
    }

    @Override
    public String toString() {
        return name + " - Electronics - " + getFinalPrice();
    }
}