import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(63);
        list.add(25);
        list.add(2);
        list.add(91);

        list2.add(5);
        list2.add(4);
        list2.add(11);
        list2.add(65);
        list2.add(11);
        list2.add(11);

        list3.add(true);

        // System.out.println(list);

        // System.out.println(list.get(2));

        // list.remove(2);
        // System.out.println(list);

        // list.set(2, 3);
        // System.out.println(list);

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(5));

        // System.out.println(list.size());
        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++)
        {
            max = Math.max(max,list.get(i));
        }

        //System.out.println(max);

        Collections.sort(list);
        //System.out.println(list);

        Collections.sort(list , Collections.reverseOrder());
        //System.out.println(list);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList();
        

        mainList.add(list);
        mainList.add(list2);
        // mainList.add(list3);

        System.out.println(mainList);

        for(int i = 0; i < mainList.size() ; i++)
        {
            ArrayList<Integer> curr =  mainList.get(i);
            for(int j=0;j<curr.size();j++)
            {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }






    }

    
    
}
