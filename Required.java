import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int k = n - (n % x) + y;

            if (k > n) {
                k -= x;
            }

            System.out.println(k);
        }
    }
}