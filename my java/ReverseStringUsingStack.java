import java.util.*;
public class ReverseStringUsingStack {

    public static void reverseString(Stack<Character> s,String str)
    {
        StringBuilder sb  = new StringBuilder();
        for(int i = 0;i<str.length();i++)
        {
            s.push(str.charAt(i));
        }

        for(int i =0;i<str.length();i++)
        {
            sb.insert(i,s.peek());
             
            s.pop();
        }

        for(int i = 0; i<sb.length();i++)
        {
            System.out.println(sb.charAt(i));
        }
    }
    

    public static void main(String[] args) {
        Stack<Character> s= new Stack<>();

        String str = "abc" ;

        reverseString(s , str);
    }
}
