import java.util.Scanner;

public class mediumNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(Math.max(a,b),Math.max(b,c));
            int min = Math.min(Math.min(a,b),Math.min(b,c));
            if(a!=max && a!=min){
                System.out.println(a);
            }
            else if(b!=max && b!=min){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        sc.close();
    }
}