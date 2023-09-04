public class spiralmatrix {

    public static void spiral(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int t = 2;

        int startc=0;
        int endc=m-1;
        int startr = 0;
        int endr = n-1;

        

        while(startr <= endr && startc <= endc ){
            

            for(int i=startr;i<=endr;i++)
            {
                // int startc=0;
                // int endc=m-1;
                // int startr = 0;
                // int endr = n-1;
                for(int j=startc;j<=endc;j++)
                {
                    if(i==0)
                    {
                        System.out.println(matrix[i][j]);
                    }
                }
                
            }
           // right
            for(int i=startr;i<=endr;i++)
                
            {
                // int startc=0;
                // int endc=m-1;
                // int startr = 0;
                // int endr = n-1;
                for(int j=startc;j<=endc;j++)
                {
                    if(j==(m-1) && i!=startc)
                    {
                        System.out.println(matrix[i][j]);
                    }
                }


            }
            // bottom
            for(int i=startr;i<=endr;i++)
            
            {
                // int startc=0;
                // int endc=m-1;
                // int startr = 0;
                // int endr = n-1;
                for(int j=endc;j>=startc;j--)
                {
                    if(i==(m-1) && j!=endr)
                    {
                        System.out.println(matrix[i][j]);
                    }
                }


            }
            //left
            for(int i=endr;i>=startr;i--)
            
            {
                // int startc=0;
                // int endc=m-1;
                // int startr = 0;
                // int endr = n-1;
                for(int j=endc;j>=startc;j--)
                {
                    if(j==0 && i!=startc && i!=endc)
                    {
                        System.out.println(matrix[i][j]);
                    }
                }
                
            }
            startc++;
            endc--;
            startr++;
            endr--;   
            
        }
    }



    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                           {5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(matrix);
    }
    
}
