import java.util.*;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
        Stack<Character> ans = new Stack<>();
        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            //count var to check if there are expression in between brackets
            int count = 0;
            if(ans.isEmpty()){
              ans.push(ch); 
                
            } else if(ch == ')'){
                //we encounter a closing brckt we pop until we reach the opening bracket and increase the count.
                while(ans.peek() != '('){
                    ans.pop();
                    count++;
                }
                //pop the opening bracket
                ans.pop();
                //if count = 0 which means or 1 it means bracket are repeating so we return true.
                if(count == 0 || count == 1){
                    return true;
                }
               
            }else{
                ans.push(ch);
            }
        }
        //else we return false.
        return false;
	}
}

