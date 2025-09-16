import java.util.Scanner;
import java.util.Arrays;
public  class R3 {
   
 public static void function(int[] arr,int n,int  i){
if (i>= n/2) {
    return;
}
int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        function(arr, n, i+1);

 };


    public static void main(String[] args) {
        System.out.println("enter the value of n  ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt() ;
        int[] arr = new int[n];
        System.out.println("enetr the values of terms inside arrays");
        for (int i = 0; i < n; i++) {
             arr [i] = sc.nextInt(); 
        };
        
        function(arr, n, 0);
        System.out.println("The swapped array is: " + Arrays.toString(arr));
       
    }
}
