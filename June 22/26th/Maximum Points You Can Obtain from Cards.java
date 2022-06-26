class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int totalSum = 0;
        int len = cardPoints.length;
        int minSubarray = 0;
        
       for(int i = 0,currSum =0; i < len; i++){
           totalSum += cardPoints[i];
           currSum += cardPoints[i];
           
           if(i < len-k) minSubarray += cardPoints[i];
           else{
               currSum -= cardPoints[i-(len-k)];
               minSubarray = Math.min(minSubarray, currSum);
           }
       }
   
        return totalSum - minSubarray;    
    }
}

// the approach here is find a minsubarray of size (len - k) then we will get a max sum of edge elements.
// use sliding window in finding the min subarray sum.
