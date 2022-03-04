//https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        // to counter the multiple spaces in the end of the sentence we take a string.
        Stack<Character> ans = new Stack<>();
        int n = s.length()-1;
        for(int i = n; i >= 0; i--){
            char ch = s.charAt(i);
            // if stack is empty and the last ele. is space which means the last element is a space so we continue.
            if(ans.isEmpty() && ch == ' '){
                continue;
                //if stack is not empty and we encounter a space which means the word has ended.
            }else if(!ans.isEmpty()  && ch == ' '){
                break;
                // if no space we keep pushing the elements till we encounter a space.
            }else{
                ans.push(ch);
            } 
        }
        //size of stack is the size of the last word.
        return ans.size();
    }
}
