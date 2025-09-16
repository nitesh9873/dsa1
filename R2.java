import java.util.Scanner;
public class R2 {
    
       static int function ( int n){
   if (n==0) {
    return  0 ;
    
   }
   
   return (n) + function(n-1);

    
}
static int function1 ( int n){
   if (n==0) {
    return  1 ;
    
   }
   
   return (n)*function1(n-1);

    
}

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number(integer)");
        int n = sc.nextInt();
       // System.out.println( function(n));
        System.out.println( function1(n));

    }
}