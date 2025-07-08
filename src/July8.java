import java.util.*;

public class July8{
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] A = new int[n];

        // Input: elements of array
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Input: number of queries
        int q = sc.nextInt();
        long totalSum = 0;

        // Processing each query
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt() - 1; // 1-based to 0-based
            int r = sc.nextInt() - 1;

            if (type == 1) {
                int A_l = A[l];
                for (int j = l; j <= r; j++) {
                    A[j] = (int) (((long)(j - l + 1) * A_l) % MOD);
                }
            } else if (type == 2) {
                long sum = 0;
                for (int j = l; j <= r; j++) {
                    sum = (sum + A[j]) % MOD;
                }
                totalSum = (totalSum + sum) % MOD;
            }
        }

        System.out.println(totalSum);
    }
}
