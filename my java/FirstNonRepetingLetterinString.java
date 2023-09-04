import java.util.*;
import java.util.LinkedList;
public class FirstNonRepetingLetterinString {

    public static void FNRLIS(String str)
    {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder strA = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
        
            freq[str.charAt(i)- (int)'a']++;
            q.add(str.charAt(i));

            while(!q.isEmpty() )
            {
                if(freq[q.peek()-(int)'a'] > 1)
                {
                    q.remove();
                }
                else{
                    break;
                }
            }
            
            // if(freq[q.peek()-(int)'a'] > 1)
            // {
            //     q.remove();
                
            // }
            // else{
                if(q.isEmpty())
                {
                    strA.append('0');
                }
                else{
                
                strA.append(q.peek());
                }
            
            //  }

        }

        
        for(int i=0;i<strA.length();i++)
        
        {
            
            System.out.println(strA.charAt(i));

            
        }
    }


    public static void main(String[] args) {
        
        //String str = new String("aabccxb");

        String str = "aabccxb";

        FNRLIS(str);

    }
    
}
