import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    static void main(String[] args) {
        ManagementSystem support = new ManagementSystem();

        support.pushRequest(new Customer("Tiki", "Nguyen Van A"));
        support.pushRequest(new Customer("Tiki", "Nguyen Van B"));

        while (!support.isEmpty()) {
            support.checkCustomerList();
            Message message = new Message("XL00", "Đang xử lý...");
            support.saveMessage(message);
            support.viewLastMessage();
            support.undoMessage();

        }
        support.viewLastMessage();
    }
}
