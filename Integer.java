import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] a = new int[7];
            int sum = 0;

            for (int i = 0; i < 7; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            int ans = Integer.MIN_VALUE;

            for (int i = 0; i < 7; i++) {
                int current = -sum + 2 * a[i];
                ans = Math.max(ans, current);
            }

            System.out.println(ans);
        }
    }
}