import java.util.*;

public class trappingrainwater {

    public static void rainwatertrapped(int height[])
    {
        int leftG = 0;
        int rightG = 0;
        int sum = 0;
        int n = height.length;
        int auxl[] =new int[height.length];
        int auxr[] =new int[height.length];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++)
        {
            if(height[i]>leftG)
            {
                leftG=height[i];
                auxl[i]=leftG;
            }
            else{
                auxl[i]=leftG;
            }
            

        }
        for(int i = 0;i<n;i++)
        System.out.print(auxl[i] + " ");
        System.out.println();
        for(int i=n-1;i>=0;i--)
        {
            if(height[i]>rightG)
            {
                rightG=height[i];
                auxr[i]=rightG;
            }
            else{
                auxr[i]=rightG;
            }

        }
        for(int i = 0;i<n;i++)
        System.out.print(auxr[i] + " ");
        System.out.println();
        
       
        for(int i=0;i<n;i++)
        {
            sum=sum+((Math.min(auxl[i],auxr[i])-height[i]));
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        int height[] = {7,2,4,9,2,0,5,11,1,6};

        rainwatertrapped(height);

    }
    
}
