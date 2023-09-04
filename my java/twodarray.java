import java.util.*;
public class twodarray {

    public static void smandla(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int sm = Integer.MAX_VALUE;
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]<sm)
                {
                    sm=matrix[i][j];
                }

            }
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]>lar)
                {
                    lar=matrix[i][j];
                }

            }

        }
        System.out.println(sm +" " + lar);
    }

    public static void main(String[] args) {
        
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]= sc.nextInt();

            }
        }

        smandla(matrix);

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
                
        //         System.out.print(matrix[i][j]);

        //     }
        //     System.out.println();
        // }

    }
    
}
