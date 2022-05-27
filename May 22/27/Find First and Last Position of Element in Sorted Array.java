// Problem Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};
        
        int len = nums.length;
        
        if(len == 0) return arr; /// if 0 we return array with -1,-1
        
        if(len == 1 && nums[0] == target) return new int[]{0,0};   // if 1 element and it is target we return  0 as both starting and end values are same.
        
        int low = 0;
        
        int high = len -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }
            else if (nums[mid] == target){    //basic binary search algo. 
                while(mid >= 0 && nums[mid] == target){   // when we find the element we go back to check for duplicates and first pos.
                    mid--;
                }
                arr[0] = ++mid;
                while(mid < len && nums[mid] == target){         // when we  find the target we move forward to check for last pos.
                    mid++;
                }
                arr[1] = --mid;
                return arr;
            }
            
        }
        return arr;   // return arr.
        
    }
}
