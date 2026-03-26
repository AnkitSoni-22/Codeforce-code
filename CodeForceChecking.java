import java.util.Scanner;

public class codeforcesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str ="codeforces";
        for(int i=0;i<num;i++){
            String s = sc.next();
            if(str.contains(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}