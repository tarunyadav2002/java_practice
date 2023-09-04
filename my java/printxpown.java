public class printxpown {

    public static int powX(int x,int n){
        if(n==0){
            return 1;
        }

        return x*powX(x,n-1);
    } 

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        //powX(x,n);
        System.out.println(powX(x,n));
    }
    
}
