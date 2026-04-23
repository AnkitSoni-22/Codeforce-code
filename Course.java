import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[k + 2];
            for (int i = 1; i <= k; i++) a[i] = sc.nextInt();

            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            List<Integer> ops = new ArrayList<>();

            while (true) {
                boolean done = true;
                for (int i = 0; i < n; i++) {
                    if (b[i] != k + 1) {
                        done = false;
                        break;
                    }
                }
                if (done) break;

                boolean moved = false;

                for (int i = 0; i < n; i++) {
                    if (b[i] == k + 1) continue;

                    int next = b[i] + 1;

                    int cnt = 0;
                    for (int j = 0; j < n; j++) {
                        if (b[j] == next) cnt++;
                    }

                    if (next == k + 1 || cnt < a[next]) {
                        b[i]++;
                        ops.add(i + 1);
                        moved = true;
                        break;
                    }
                }

                if (!moved || ops.size() > 1000) {
                    System.out.println(-1);
                    break;
                }
            }

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (b[i] != k + 1) ok = false;
            }

            if (ok) {
                System.out.println(ops.size());
                for (int x : ops) System.out.print(x + " ");
                System.out.println();
            }
        }
    }
}