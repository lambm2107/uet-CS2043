import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private double discount;


    private static double taxRate = 0.1;
    private static double totalRevenue = 0;

    public Product(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public static void updateTaxRate(double newRate) {
        taxRate = newRate;
    }

    public double calculateFinalPrice() {
        return (price - discount) * (1 + taxRate);
    }

    public void updateDiscount(double newDiscount) {
        this.discount = newDiscount;
    }

    public void sell(int amount) {
        if (amount <= this.quantity) {
            double finalPrice = calculateFinalPrice();
            double earning = amount * finalPrice;

            this.quantity -= amount;
            totalRevenue += earning; // Cộng dồn vào biến tĩnh dùng chung

            System.out.println("Bán thành công " + amount + " " + name);
        } else {
            System.err.println("Không đủ hàng trong kho  " + name);
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}