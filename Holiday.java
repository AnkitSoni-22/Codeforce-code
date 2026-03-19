import java.util.*;

public class holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            total += (max - a[i]);
        }

        System.out.println(total);
    }
}