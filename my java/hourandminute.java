public class hourandminute {
    public  int smallangle(int h,int m)
    {
        if(m==60)
        {
            h=h+1;
            m=0;
        }
        if(h>12)
        {
            h=h-12;
        }
        int hoangle = (int) (0.5)*(h*60 + m);
        int minangle = (int) (m*6);

        int angle = Math.abs(hoangle-minangle);
        int ans = math.min(angle,360-angle);

        return ans;
    }
    

    public static void main(String[] args) {
        System.out.println(smallangle(9,30));
    }
    
}
