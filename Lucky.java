import java.util.Scanner;
public class lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int number = sc.nextInt();
            int left=0;
            int right =0;
            for(int j=0;j<6;j++){
                int digit=number%10;
                number/=10;
                if(j<3){
                    left+=digit;
                }
                else{
                    right+=digit;
                }
            }
            if(left==right){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}