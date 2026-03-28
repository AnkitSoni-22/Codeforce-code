import java.util.Scanner;

public class spyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int same=0;
            if(arr[0]==arr[1]) same=arr[0];
            if(arr[1]==arr[2]) same=arr[1];
            if(arr[2]==arr[0]) same=arr[2];
            for(int j=0;j<n;j++){
                if(arr[j]!=same){
                    System.out.println(j+1);
                    break;
                }
            }
        }
        sc.close();
    }
}