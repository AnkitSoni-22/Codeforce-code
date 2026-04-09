import java.util.Scanner;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int solved =0;
        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b+c>=2){
                solved++;
            }
        }           
        System.out.println(solved);
        sc.close();
    }
}