class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> ans = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
           //if we encounter a opening bracket we use -1 as a flag and push it into the stack.
            if(ch == '('){
               ans.push(-1); 
            }else{
                //if the top element is a closing bracket which means -1 && and character is a closing bracket we pop and push 1 as a score.
                if(ans.peek() == -1){
                    ans.pop();
                    ans.push(1);
                }else{
                    //if it is a nested case we pop until we reach a 1 and then multiply the whole value by 2.
                    int count = 0;
                    while(ans.peek() != -1){
                        count+=ans.pop();
                    }
                    ans.pop();
                    ans.push(2*count);
                }
            }
        }
        // after solving all the nested and individual cases just add all the elements in stack.
        int count = 0;
        while(ans.size()>0){
         count+=ans.pop();
     }
        return count;
    }
}
