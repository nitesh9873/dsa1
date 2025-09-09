import java.util.Scanner;

public class Lava {
    public static void main(String[] args) {
        // function in order to find the divisor of a given number 
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
         int n = sc.nextInt();
    
     for (int i = 1; i <= n; i++) {
        {
if ( n%i==0)
System.out.println(i);


        }
        
     }
    }
}
