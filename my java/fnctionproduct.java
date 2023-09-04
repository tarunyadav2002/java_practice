import java.util.*;
public class fnctionproduct {

    public static void product(int num1,int num2) {
        int pro = num1*num2;
        System.out.println(pro);
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        product(a,b);
    }

    
}
