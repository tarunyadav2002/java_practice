import javax.sql.rowset.spi.SyncResolver;

public class invertedpyramidhalfwithnumbers {
    public static void main(String[] args){

        int n=5;
        

        for(int i = 0;i<n;i++)
        {
            int k=1;
            for(int j=0;j<n;j++)
            {
                if(j>=(n-i))
                {
                    System.out.print(" ");
                }
                else
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }
    
}
