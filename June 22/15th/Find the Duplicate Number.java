
// 


class Solution {
    public int findDuplicate(int[] nums) {
       /*             BRUTE FORCE 
        
        Arrays.sort(nums);
        
        int i = 0;
        
        for(int j = 1; j < nums.length; j++){
            if(nums[i++] == nums[j]){
                return nums[j];
            }
        }
        return -1;
        
        
        TC - NLOGN + N
        SC - 1
        
        */
        
        
        // CYCLE METHOD.
        
        int slow  = 0;
        int fast = 0;
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        
        slow = 0;
         while(slow != fast){
             slow = nums[slow];
             fast = nums[fast];
         }
        return slow; 
        
        
        // TC - 0(N)
        // SC - 0(1)
    }
}
