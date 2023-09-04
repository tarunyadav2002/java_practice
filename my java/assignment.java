import java.util.*;
public class assignment {

    public static boolean checkrepeat(int nums[])
{
    int n = nums.length;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]==nums[j])
            return true;
        }
    }
    return false;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=   sc.nextInt();
        }

        // checkrepeat(nums);
        System.out.println(checkrepeat(nums));
        

    }
    
}
