import java.util.Scanner;

public class BankAccount {
    private final String accountNumber;
    public String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance < 0) {
            System.out.println("Số tiền không hợp lệ.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            System.out.println("Đã gửi thành công số tiền " + amount);
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            System.out.println("Đã rút thành công số tiền " + amount);
            return true;
        } else {
            System.out.println("Số tiền không hợp lệ!");
            return false;
        }
    }

    public void getBalanced() {
        System.out.println("Số dư hiện tại của bạn là: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tài khoản của bạn: ");
        String accountNumber = sc.next();
        System.out.print("Nhập tên của bạn: ");
        String ownerName = sc.next();
        BankAccount bankAccount = new BankAccount(accountNumber, ownerName);

        boolean finished = true;
        while (finished) {
            System.out.println("-----------------------------");
            System.out.println("|  1. Nạp tiền              |");
            System.out.println("|  2. Rút tiền              |");
            System.out.println("|  3. Hiển thị số dư        |");
            System.out.println("-----------------------------");
            System.out.print("Chọn hành động của bạn: ");
            int choosenNumber = sc.nextInt();

            switch (choosenNumber) {
                case 1:
                    System.out.print("Nhập số tiền muốn gửi: ");
                    int amountDeposit = sc.nextInt();
                    bankAccount.deposit(amountDeposit);
                    break;
                case 2:
                    System.out.print("Nhập số tiền muốn rút: ");
                    int amountWithdraw = sc.nextInt();
                    boolean checkWithdraw = bankAccount.withdraw(amountWithdraw);
                    break;
                case 3:
                    bankAccount.getBalanced();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không?(Y/N): ");
            String continued = sc.next();
            while (!continued.equalsIgnoreCase("y") && !continued.equalsIgnoreCase("n")) {
                System.out.print("Định dạng không chính xác! Mời bạn nhập lại: ");
                continued = sc.next();
            }
            if (continued.equalsIgnoreCase("n")) {
                System.out.println("Tạm biệt quý khách~~~");
                finished = false;
            }

        }
    }
}
