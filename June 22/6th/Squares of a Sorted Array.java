
//  https://leetcode.com/problems/squares-of-a-sorted-array/


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        
        int low = 0;
        int high = n-1; 
        
        int i = n-1;
       // 2pointers 
        while(low <= high){
            // if value bigger than the 1st pointer
            if(Math.abs(nums[low]) < Math.abs(nums[high])){
                //last index will be high
                arr[i--] = nums[high] * nums[high];
                //decrement the pointer
                    high--;
            }else{
                //if 1st pointer is greater then last index will be square of low.
                arr[i--] = nums[low] * nums[low];
                low++;
            }
        }
        return arr;
    }
}
