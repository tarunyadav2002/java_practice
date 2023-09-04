public class findsubsets {

    public static void subSets(String str,String ans,int i)
    {
        if(i == str.length())
        {
            
            System.out.println(ans);
            return;
        }
        //yes
        subSets(str,ans,i+1);
        subSets(str,ans+str.charAt(i),i+1);
        // no
        // subSets(str,ans,i+1);
    }

    public static void main(String[] args) {
        String str = "abc" ;
        String ans = "";
        subSets(str,ans,0);
        
    }
    
}
