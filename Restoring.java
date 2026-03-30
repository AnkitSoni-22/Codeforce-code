import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = arr[3]; // a + b + c

        int a = max - arr[0];
        int b = max - arr[1];
        int c = max - arr[2];

        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}