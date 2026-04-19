public class Account {
    private String accountId;
    private double balance;
    private Transaction[] history;
    private int count = 0;

    public Account(String accountId, int size) {
        this.accountId = accountId;
        this.history = new Transaction[size];
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addTransaction(Transaction t) {
        history[count++] = t;
    }

    public Transaction[] getHistory() {
        Transaction[] copy = new Transaction[count];
        for (int i = 0; i < count; i++) {
            copy[i] = history[i];
        }
        return copy;
    }

    public void printHistory() {
        System.out.println("ACCOUNT DATA:");
        for (int i = 0; i < count; i++) {
            System.out.println(history[i].toString());
        }
    }

    public static void main(String[] args) {

        Account acc = new Account("ACC001", 10);

        acc.addTransaction(new Transaction("T1", "100", "2026-03-18"));
        acc.addTransaction(new Transaction("T2", "200", "2026-03-19"));

        acc.printHistory();

        System.out.println("-----Hacker xâm nhập-----");

        Transaction[] hacked = acc.getHistory();

        // Hacker thử sửa dữ liệu
        hacked[0] = new Transaction("HACKED", "999999", "9999-99-99");

        // In mảng hacker
        System.out.println("Giao diện của Hacker :");
        for (Transaction t : hacked) {
            System.out.println(t.toString());
        }

        System.out.println("Sự thực: ");
        acc.printHistory();
    }
}
