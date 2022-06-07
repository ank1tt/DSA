// https://leetcode.com/problems/sort-colors/


class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int temp;
        
        
        // Dutch National Flag Algo.
        
        
        while(mid <= high){
            switch (nums[mid]){
                case 0: {    //when mid is 0. we will swap index low and mid. and increment both
                    temp = nums[low];
                    nums[low] =  nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{   // when mid is 1 we will just increase it.
                    mid++;
                    break;
                }
                case 2: {  //when mid is 2 we will swap it with 2 and decrement the high value.
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
