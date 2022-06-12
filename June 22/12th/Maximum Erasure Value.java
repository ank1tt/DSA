// Two Pointers and Hashset.
// https://leetcode.com/problems/maximum-erasure-value/

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        
        int sum = 0;
        
        int res = 0;
        int left = 0;
        
        
        // hashset to check if the integer is reoccuring or nah.
        HashSet<Integer> ans = new HashSet<>();
        
        for(int right = 0; right < n;){
            
            // if an integer reoccurs we decrease the left value from sum and remove the element from set. 
            // increment the left value till we find all unique.
            
            if(ans.contains(nums[right])){
                sum -= nums[left];
                ans.remove(nums[left]);
                left++;
                    continue;
            } else{
                // if the integer is unique and we add in the sum and push in the hashset.
                sum+= nums[right];
                res = Math.max(res,sum);
                ans.add(nums[right]);
                right++;
            }
        }
        return res;
    }
}
