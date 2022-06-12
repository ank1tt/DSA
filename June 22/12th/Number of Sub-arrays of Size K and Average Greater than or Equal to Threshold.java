// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
// Sliding Window Fixed Window Type.



class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int i = 0;
        int j = 0;
        
        int sum = 0;
        
        int count = 0;
        
        // Sliding Window.
        // if window size is less than k we keep incrementing j with adding the values in j.
        
        while(j < arr.length){
            sum+=arr[j];
            
            if(j-i+1 < k){
                j++;
            }
            
            // when the window size equals we see if the avg is greater than the target . if yes we increase the count.
            else if(j-i+1 == k){
                if(sum/k >= threshold){
                    count++;
                }
                
                // if no then we decrease the ith element from the same and to maintain the size of the window we increment both i and j.
                sum -= arr[i];
                i++;
                j++;
                }
            }
        return count;
        }
    }
