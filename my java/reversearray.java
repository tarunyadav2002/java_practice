public class reversearray {

   /*  public static void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
    }*/

    public static void revarray(int num[]) {
        int n = num.length;
        for(int i =0;i<n/2;i++)
        {
           //swap(num[i],num[n-i-1]);
           int temp = num[i];
            num[i]=num[n-i-1];
            num[n-i-1]=temp;;
        }
        for(int i =0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }


    public static void main(String[] args) {
        int num[] = {1,5,7,8,9,11};
        
        revarray(num);
    }
    
}
