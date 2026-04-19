import java.util.Scanner;

public class Solution {
    public int reverse(int n) {
        if (n % 10 == 0 || n < 0)
            return -1;

        int res = 0;
        while (n>0) {
            int digit = n % 10;
            n /= 10;
            res = res * 10 + digit;
        }

        return res;
    }

    public boolean isPalindrome(int n) {
        if (n % 10 == 0 || n < 0)
            return false;
        Solution sol = new Solution();
        return n == sol.reverse(n);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sol.isPalindrome(n));
    }
}
