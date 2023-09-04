public class mergesort {

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSortt(int arr[],int si,int ei) {
        if(si>=ei)
        {
            return;
        }
        int mi = si+(ei-si)/2;
        mergeSortt(arr,si,mi);
        mergeSortt(arr,mi+1,ei);
        merge(arr,si,mi,ei);
        
    }
    public static void merge(int arr[],int si,int mi,int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mi+1;
        int k = 0;

        while(i<=mi && j<=ei){
            if(arr[i]<arr[j])
            {
                temp[k]= arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i <= mi)
        {
            temp[k++]=arr[i++];
        }
        while(j <= ei)
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];

        }

        
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSortt(arr,0,arr.length-1);
        printarr(arr);
    }
    
}
