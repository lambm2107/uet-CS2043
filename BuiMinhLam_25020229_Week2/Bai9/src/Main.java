import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sản phẩm 1:");
        Product p1 = new Product(sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());

        System.out.println("Sản phẩm 2:");
        Product p2 = new Product(sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());


        System.out.print("Nhập số lượng mua p1: ");
        p1.sell(sc.nextInt());
        System.out.print("Nhập số lượng mua p2: ");
        p2.sell(sc.nextInt());


        System.out.printf("Giá p1 ban đầu: %.2f\n", p1.calculateFinalPrice());
        System.out.printf("Giá p2 ban đầu: %.2f\n", p2.calculateFinalPrice());

        Product.updateTaxRate(0.08);
        System.out.printf("Giá p1 sau đổi thuế: %.2f\n", p1.calculateFinalPrice());
        System.out.printf("Giá p2 sau đổi thuế: %.2f\n", p2.calculateFinalPrice());

        p1.updateDiscount(10.0);
        System.out.printf("Giá p1 sau đổi discount: %.2f\n", p1.calculateFinalPrice());
        System.out.printf("Giá p2 sau đổi discount: %.2f\n", p2.calculateFinalPrice());

        System.out.printf("\nTổng doanh thu toàn hệ thống: %.2f$\n", Product.getTotalRevenue());

        sc.close();
    }
}