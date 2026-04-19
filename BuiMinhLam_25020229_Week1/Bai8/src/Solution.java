import java.util.Scanner;

public class Solution {
    public static boolean isPrime(int n) {
        if (n<2)
            return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sol.isPrime(n));
    }
}
