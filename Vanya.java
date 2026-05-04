import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int level = 1;
        int height = 0;

        while (true) {
            int need = level * (level + 1) / 2;

            if (n >= need) {
                n -= need;
                height++;
                level++;
            } else {
                break;
            }
        }

        System.out.println(height);
    }
}