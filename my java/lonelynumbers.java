import java.util.ArrayList;
import java.util.*;

public class lonelynumbers {
    public static void LonelyNumbers(ArrayList<Integer> list)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                if(j==i)
                {
                    continue;
                }
                if(list.get(i)==list.get(j) || (list.get(i)-1)==list.get(j) || (list.get(i)+1)==list.get(j))
                {
                    list.remove(i);
                    j--;
                    list.remove(j);
                }
                
            }

        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter values");

        for(int i = 0;i<n;i++)
        {
            list.add(sc.nextInt());
        }

        LonelyNumbers(list);
    }
    
}
