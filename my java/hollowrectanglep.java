public class hollowrectanglep {

    public static void main(String[] args){

        int n=4;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i == 0 || i == n-1 || j == 0 || j ==n)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
