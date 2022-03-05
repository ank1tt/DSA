//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i = 0; i < operations.length; i++){
            // took a string variable to check 
            String ans = operations[i];
            // if it is decrement we decrease the final value.
            if(ans.equals("--X") || ans.equals("X--")){
                count--;
            }else{
                //else increase the value by 1
                count++;
            }
        }
        return count;
    }
}
