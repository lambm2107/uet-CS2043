import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ManagementSystem {
    private Queue<Customer> customerQueue = new LinkedList<>();
    private Stack<Message> messageHistory = new Stack<>();

    public void pushRequest(Customer customer) {
        customerQueue.offer(customer);
        System.out.println("Khách hàng " + customer.getName() + " đã vào hàng chờ." );
    }

    public void checkCustomerList() {
         Customer c = customerQueue.poll();
         if (c == null) {
             System.out.println("Hàng chờ trống");
         } else {
             System.out.println("Đang xử lý cho khách hàng " + c.getName());
         }
    }

    public void saveMessage(Message message) {
        messageHistory.add(message);
        System.out.println("Thông báo: Đã lưu tin nhắn vào lịch sử!");
    }

    public void undoMessage() {
        if (!messageHistory.isEmpty()) {
            messageHistory.pop();
            System.out.println("Đã undo tin nhắn");
        } else {
            System.out.println("Không có tin nhắn");
        }

    }

    public void viewLastMessage() {
        if (!messageHistory.isEmpty()) {
            System.out.println("Tin nhắn cuối cùng: " + messageHistory.peek().getContent());
        } else {
            System.out.println("Không có tin nhắn");
        }
    }

    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }




}
