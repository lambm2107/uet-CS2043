public class NumberWrapper {
    private int value;

    public NumberWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void swapNumber(NumberWrapper a, NumberWrapper b) {
        NumberWrapper temp = a;
        a = b;
        b = temp;
        System.out.println("Sau khi chuyển:");
        System.out.println("n1 = " + a.getValue());
        System.out.println("n2 = " + b.getValue());
    }

    public static void main(String[] args) {
        NumberWrapper n1 = new NumberWrapper(5);
        NumberWrapper n2 = new NumberWrapper(10);
        System.out.println("Truớc khi chuyển:");
        System.out.println("n1 = " + n1.getValue());
        System.out.println("n2 = " + n2.getValue());
        swapNumber(n1, n2);

    }
}

