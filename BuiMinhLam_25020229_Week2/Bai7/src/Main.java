public class Main {
    public static void main(String[] args) {
        // Tạo mảng Product[] arr gồm 2 sản phẩm
        Product p1 = new Product("P01", "Laptop", 1000);
        Product p2 = new Product("P02", "Chuột máy tính", 50);
        Product[] arr = {p1, p2};

        Inventory kho = new Inventory(arr);


        System.out.println("Trước khi thay đổi giá trị: ");
        kho.display();

        arr[0].setPrice(5000);

        System.out.println("Sau khi thay đổi giá trị: ");
        kho.display();
    }
}