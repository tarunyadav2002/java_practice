public class twonumbers {

    
        public static int[] twoSum(int[] nums, int target) {
            
    
            int ans[] = new int[2];
            
            
            for(int i = 0; i< nums.length ; i++)
            {
                for(int j = i+1 ; j<nums.length;j++)
                {
                    if((nums[i]+nums[j])==target && i!=j){
                    ans[0]=i;
                    ans[1] = j;
                    }
                    break;
                    
    
                }
    
            }
            return ans;   
        }

        public static void main(String[] args) {
            int nums[] = {3,2,3};
            //int target = 6;

            System.out.println(twoSum(nums,6));
        }
    
    
}
