import java.util.*;

public class Main {
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 4; i < n; i++) {
            if (!isPrime(i) && !isPrime(n - i)) {
                System.out.println(i + " " + (n - i));
                break;
            }
        }
    }
}