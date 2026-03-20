import java.util.*;

public class newYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int distance = x[2] - x[0];
        System.out.println(distance);
        sc.close();
    }
}