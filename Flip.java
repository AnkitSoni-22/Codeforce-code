import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int p = sc.nextInt() - 1;
            int x = a[p];

            int ans = 0;

            for (int i = 0; i < p; ) {
                if (a[i] != x) {
                    ans++;
                    while (i < p && a[i] != x) i++;
                } else {
                    i++;
                }
            }

            for (int i = p + 1; i < n; ) {
                if (a[i] != x) {
                    ans++;
                    while (i < n && a[i] != x) i++;
                } else {
                    i++;
                }
            }

            System.out.println(ans);
        }
    }
}