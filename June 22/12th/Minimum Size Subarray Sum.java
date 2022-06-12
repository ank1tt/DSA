// Sliding Window Variable Type.
// https://leetcode.com/problems/minimum-size-subarray-sum/


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        
        int len = Integer.MAX_VALUE;
        int sum = 0;
        
        
        
        while(start < nums.length){
            
            // if the sum is lesss than the target then we can extend the window.
            if(sum < target && end < nums.length){
                sum+=nums[end];
                end++;
            }
            else if(sum >= target){
                // if window sum atleast equal to the given sum then we can shrink it.
                // decrease the start value and increment the start.
                len = Math.min(len, end - start);
                sum-=nums[start];
                start++;
            }
            else{
                break;
            }
        }
        // if len == max value then return 0 else return len
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}
