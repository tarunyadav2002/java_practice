import java.util.*;
public class pairSumone {

    public static boolean bruteForce(ArrayList<Integer> list , int target)
    {
        int sum = 0;
        for(int i=0;i<list.size();i++)
        {
            for(int j = i+1;j<list.size();j++)
            {
                //sum = ;
                if(list.get(i)+list.get(j) == target)
            {
                return true;
            }
               

            }
            
        }
        return false;
    }

    public static boolean twoPointer(ArrayList<Integer> list , int target)
    {
        int lp = 0;
        int rp = list.size()-1;

        while(lp<rp)
        {
            if((list.get(lp)+list.get(rp))==target)
            {
                return true;
            }
            else if((list.get(lp)+list.get(rp))<target)
            {
                lp++;
            }
            else 
            {
                rp--;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target  = 11;

        System.out.println(twoPointer(list,target));
        System.out.println(bruteForce(list,target));
    }
    
}
