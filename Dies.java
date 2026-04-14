import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();

        int max = Math.max(Y, W);
        int favorable = 6 - max + 1;

        int g = gcd(favorable, 6);

        System.out.println((favorable / g) + "/" + (6 / g));
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}