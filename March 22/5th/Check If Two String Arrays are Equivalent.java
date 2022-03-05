//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       // took 2 string var to complete the whole string.
            String ans1 = "";
            String ans2 = "";
            //added the first string
           for(int i = 0; i < word1.length; i++){
               String a = word1[i];
               ans1 += word1[i];
           } 
            //added the 2nd string
            for(int j = 0; j < word2.length; j++){
                  
                    ans2 += word2[j];
                    
            }
            //boolean expression to check if two strings are equal or nah
          if(ans1.equals(ans2)){
                  return true;
          }  else{
               return false;
          }
    }
}
