import java.util.*;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
        if(input.length() % 2 != 0){
            return -1;
        }
        Stack<Character> ans = new Stack<Character>();
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ans.isEmpty()){
                ans.push(ch);
            }else if(!ans.isEmpty()){
                // we get a balanced part we remove it from the stack
                if(ans.peek() == '{' && ch == '}'){
                    ans.pop();
                }else{
                    ans.push(ch);
                }
                
            }
            }      
            
        int count = 0;
        while(!ans.isEmpty()){
            char c1 = ans.pop();
            char c2 = ans.pop();
            
            if(c1 == c2){
                count++;
            }else{
                count+=2;
            }
        }
        return count;
	}

}
