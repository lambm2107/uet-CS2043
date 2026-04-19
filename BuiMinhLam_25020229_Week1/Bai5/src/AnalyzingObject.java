public class AnalyzingObject {
}

// a) BankAccount
public class BankAccount {

    // Trạng thái của đối tượng ở đây là accountNumber, ownerName, balance
    private String accountNumber;
    private String ownerName;
    private double balance = 0.0;

    // Các hành vi của đối tượng là openAccount, deposit, withdraw --> Khởi tạo những hành vi mà đối tượng sẽ thực hiện
    public void openAccount(String accNum, String owner) {
        this.accountNumber = accNum;
        this.ownerName = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        /*
            myAccount là một định danh của đối tượng
                --> Nếu có một đối tượng cùng trạng thái nhưng định danh khác --> Hai đối tượng riêng biệt
         */
        BankAccount myAccount = new BankAccount();
        myAccount.openAccount("101202303", "Nguyen Van A");
        myAccount.deposit(500.0);
        myAccount.withdraw(150.0);
    }

}


// b) SmartFan
public class SmartFan {
    // Trạng thái của đối tượng: brand, isPowerOn, speedLevel
    private String brand = "Xiaomi";
    private boolean isPowerOn = false;
    private int speedLevel = 0; // Mức từ 1 đến 3

    // Hành vi của đối tượng: turnOn, turnOff, setSpeed
    public void turnOn() {
        this.isPowerOn = true;
    }

    public void turnOff() {
        this.isPowerOn = false;
        this.speedLevel = 0;
    }

    public void setSpeed(int newSpeed) {
        // Chỉ đổi tốc độ nếu quạt đang bật
        if (this.isPowerOn == true) {
            this.speedLevel = newSpeed;
        }
    }

    public static void main(String[] args) {
        // Định danh của đối tượng: livingRoomFan, bedroomFan
        SmartFan livingRoomFan = new SmartFan();
        livingRoomFan.turnOn();
        livingRoomFan.setSpeed(2);

        SmartFan bedroomFan = new SmartFan();
        bedroomFan.setSpeed(3);
        bedroomFan.turnOn();
    }
}
