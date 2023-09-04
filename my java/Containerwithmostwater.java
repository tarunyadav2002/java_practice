import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Containerwithmostwater {

    // public static void maxwater(ArrayList<Integer> height)
    // {
    //     int maxA = Integer.MIN_VALUE;

        


    //     for(int i = 0; i<height.size();i++)
    //     {
            
    //         for(int j = i+1; j< height.size();j++)
    //         {
    //             maxA = Math.max(Math.min(height.get(i), height.get(j)) * (j-i), maxA) ;
    //         }
    //     }

    //     System.out.println(maxA);

        
    // }


    public static void usingTwoPointers(ArrayList<Integer> height)
    {
        int lp = 0;
        int rp = height.size()-1;
        int maxA = Integer.MIN_VALUE;

        while(rp>lp)
        {
            maxA = Math.max(Math.min(height.get(lp), height.get(rp)) * (rp-lp), maxA) ;
            if(height.get(lp)>height.get(rp))
            {
                rp--;
            }
            else{
                lp++;
            }
        }

        System.out.println(maxA);

    }

    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

       // maxwater(height);

        usingTwoPointers(height);

        

        
    }
    
}
