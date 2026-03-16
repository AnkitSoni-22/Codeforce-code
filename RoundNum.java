import java.util.*;
public class roundNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();
            int place = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNumbers.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }
            System.out.print(roundNumbers.size() + " ");
            for (int roundNum : roundNumbers) {
                System.out.print(roundNum + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}