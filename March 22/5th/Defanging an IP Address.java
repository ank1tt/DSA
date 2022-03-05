//https://leetcode.com/problems/defanging-an-ip-address/


class Solution {
    public String defangIPaddr(String address) {
        String ans = "";
        for(int i = 0; i < address.length(); i++){
            //if the character is dot we change the new string.
            if(address.charAt(i) == '.'){
                ans = ans+"[.]";
            }else{
                //if not we just keep adding the characters.
                ans+=address.charAt(i);
            }
        }
        return ans;
    }
}
