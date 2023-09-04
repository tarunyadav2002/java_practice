public class diagonalsum {

    public static void sumdiagonal(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(i ==j || i+j == n-1)
        //         sum = sum + matrix[i][j];
        //     }
            
            
        // }
        // int startr=0;
        // int endr = n;
        // int startc= 0;
        // int endc = m;
        // int sum2 = 0;
        
        // for(int i=startr;i<endr;i++)
        
        // {
        //     for(int j=startc;j<endc;j++)
        //     {
                
        //         sum2 = sum2 + matrix[i][j];
        //     }
        //     startr++;
        //     endc--;
            
            
        // }

        for(int i = 0;i<n;i++)
        {
            sum+= matrix[i][i];
            sum+=matrix[i][n-1-i];
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        sumdiagonal(matrix);
    }
    
}
