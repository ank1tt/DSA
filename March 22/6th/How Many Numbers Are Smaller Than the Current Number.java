class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
            int[] ans = new int[n];
            int c = 0;
            for(int i = 0; i < n; i++){
                    int count = 0;
                    int j = 0;
                    for( j = 0; j < n; j++){
                            if(nums[j] < nums[i] && i != j){
                                count++;    
                            }
                    }
                    ans[c++] = count;
            }
            return ans;
            
    }
}
