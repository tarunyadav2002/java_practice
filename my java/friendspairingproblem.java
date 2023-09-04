import java.util.*;
public class friendspairingproblem {

    public static int result(int n)
    {
        if(n==2 || n==1){
            return n;
        }
        
        
        return result(n-1)+(n-1) * result(n-2);


    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int friends = n ; 
        
        System.out.println(result(n));
    }
    
}
