import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            boolean isSquare = true;
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(i + n / 2)) {
                    isSquare = false;
                    break;
                }
            }

            System.out.println(isSquare ? "YES" : "NO");
        }
    }
}