//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> ans = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // if the stack is empty we just push the element.
            if(ans.isEmpty()){
                ans.push(ch);
                // if the it  is balanced we pop the element at the top.
            }else if(ans.peek() == '(' && ch == ')'){
                ans.pop();
            }else{
                //if not balanced just push the character
                ans.push(ch);
            }
        }
        // the no required to balance the string is basically equal to the size of the stack.
        return ans.size();
    }
}
