
// https://leetcode.com/problems/move-zeroes/

// Two Pointers.

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        // 2pointers
        while(i < nums.length){
            // if it is non zero the we increment both.
            if(nums[i] != 0){
                i++;
                j++;
                // if i is 0 and j is not equal to 0 then we interchange the values.
            }else if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
            }else{
                //else increment the j till we find a non zero.
                j++;
            }
            // if j is equals to size of the array our work is done.
            if(j == nums.length){
                return;
            }
        }
    }
}
