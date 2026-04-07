import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (a[i] != k) continue;

                for (int j = i; j < n; j++) {
                    int countK = 0;
                    Map<Integer, Integer> map = new HashMap<>();

                    for (int p = i; p <= j; p++) {
                        map.put(a[p], map.getOrDefault(a[p], 0) + 1);
                        if (a[p] == k) countK++;
                    }

                    boolean ok = true;
                    for (int val : map.keySet()) {
                        if (val != k && map.get(val) >= countK) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}