public class returnkeyindex {

    public static void result(int arr[],int key,int idx){
        if(idx == arr.length){
            return;
        }

        if(arr[idx]==2)
        {
            System.out.println(idx);
        }
        result(arr,key,idx+1);

    }

    public static void main(String[] args) {
        int arr[]= {3,2,4,5,6,2,7,2,2} ;
        int key = 2;
        int idx = 0;
        result(arr,key,idx);
    }
    
}
