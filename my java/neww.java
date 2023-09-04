import java.util.*;
public class neww {



    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();

        name.append("my name is tarun");

        StringBuilder ans = new StringBuilder();

    for(int i=name.length()-1;i>=0;i--)
       {
        if(name.charAt(i) == " ")
          {        
                 for(int j=name.length();j=i;j--)
                    {
                         ans.append(charAt(name(j)));
               
                     }
          }
        }
    

    for(int i=0;i<ans.length();i++)
    {
        system.out.print(ans.charAt(i));
    }
    
}
}
