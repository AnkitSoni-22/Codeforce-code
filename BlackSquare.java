import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }

        String s = sc.next();
        int total = 0;

        for (char c : s.toCharArray()) {
            total += a[c - '1'];
        }

        System.out.println(total);
    }
}