import java.util.Scanner;

public class Solution {
    public static long fibonacci(long n) {
        long f0 = 0, f1 = 1, f = 1;
        for (int i = 2; i <= n; i++) {
            if (f0 >= Long.MAX_VALUE - f1)
                return Long.MAX_VALUE;
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Solution solution = new Solution();

        System.out.println(solution.fibonacci(n));
    }
}

