import java.util.*;




public class binarysearch {

    public static int binsearch(int num[] , int key){
        int start = num[0];
        int end = num[num.length-1];
        int mid = (start+end)/2;
        while(start<end){
        if(key>mid)
        {
            start=mid;
        }
        else if(key<mid)
        {
            end = mid;
        }
        else if(mid == key)
        {
            int ans = 
        } 
        
    }
    //return mid;
        
    }
    
    public static void main(String[] args) {
        
        int num[] = {2,4,6,8,10,12,14,16};

        int key = 10;

        System.out.println(binsearch(num,key)); 
    }
}
