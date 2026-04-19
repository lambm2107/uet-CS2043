import java.util.Scanner;

public class Solution {
    public int secondLargest(int[] a, int n){
        if (n<2)
            return -1;
        int maxNumber = a[0], secondNumber = a[1];
        for (int i = 1; i < n; i++) {
            if (a[i] > maxNumber) {
                secondNumber = maxNumber;
                maxNumber = a[i];
            } else if (a[i] > secondNumber && a[i] != maxNumber) {
                secondNumber = a[i];
            }
        }

        if (secondNumber == maxNumber)
            return -1;

        return secondNumber;
    }



    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];

        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        System.out.println(sol.secondLargest(a, n));
    }
}
