import java.util.Scanner;
public class serejaDima{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int low = 0;
        int high = num-1;
        int flag=0;
        int sereja=0;
        int dima=0;
        while(low<=high){
            if(arr[low]>arr[high]){
                if(flag%2==0){
                    sereja+=arr[low];
                }
                else{
                    dima+=arr[low];
                }
                low++;
            }
            else{
                if(flag%2==0){
                    sereja+=arr[high];
                }
                else{
                    dima+=arr[high];
                }
                high--;
            }
            flag++;
        }
        System.out.println(sereja+" "+dima);
        sc.close();
    }
}