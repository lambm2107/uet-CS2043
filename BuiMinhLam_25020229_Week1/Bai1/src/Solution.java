import java.util.Scanner;

public class Solution {
    public static int sumOfDigits(int n) {
        if (n < 0)
            return -1;

        int res = 0;

        while (n > 0) {
            res += n%10;
            n /= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(sol.sumOfDigits(n));
    }
}
