import java.util.*;

public class pallindrome {

    public static boolean pallindrome(int num){
        int number = num ;
        int pow =0;
            
        int rev = 0;
        while(num>0)
        {
            
            int lastd = num%10;

            rev = rev + (lastd*(int)Math.pow(10,pow));
            num = num/10;
            pow++;
        }
        if(number == rev){
            return true;
        }
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int num = sc.nextInt();

        System.out.println(pallindrome(num));
    }
    
}
