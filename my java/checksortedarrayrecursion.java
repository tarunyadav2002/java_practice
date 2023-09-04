public class checksortedarrayrecursion {
    public static boolean check(int a[], int i){
        if(i>=a.length-1){
            return true;
        }
        if(a[i] > a[i+1]){
            return false;
        }

        return check(a,i+1);
    }

    public static int firstO(int arr[],int k,int i){
       if(i == 0)
       {
        return -1;
       }
        
        if(arr[i]==k)
        {
            return i;
        }
        
        return firstO(arr,k,i-1);
            


    }

    public static void main(String[] args) {
     //   int a[] = {1,2,3,4,5};

        //check(a,0);
        //

        int arr[] = {5,5,5,4,7,5,4,87,7,8,5,55,5,5,5};
        int k = 5;
        
        System.err.println(firstO(arr,k,arr.length-1));
    }


    
}
