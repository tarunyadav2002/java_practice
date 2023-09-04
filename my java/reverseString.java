//import java.util.*;
public class reverseString {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();

        name.append("my name is tarun");

        StringBuilder ans = new StringBuilder();

        

        
        int lp = name.length()-1;

    for(int i=name.length()-1;i>=0;i--)
       {
        
        if(name.charAt(i) == ' ' || i == 0)
          {  
            for(int j = i ;j<=lp;j++)     
                    {
                         ans.append(name.charAt((j)));
               
                     }  
                     lp = i;     
          }
          

        }
    

    for(int i=0;i<=ans.length()-1;i++)
    {
        System.out.print(ans.charAt(i));
    }
        
    }
    
}
