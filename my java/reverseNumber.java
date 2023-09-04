import java.util.*;
public class reverseNumber {

    public static void main(String[] args){

        System.out.println("enter the number");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int rev = 0;

        while(num>0)
        {
            int last_digit = (num%10);
            rev = (rev*10) + last_digit;

            num = num/10;

        }

        System.out.println(rev);





    }
    
}
