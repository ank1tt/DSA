// https://leetcode.com/problems/palindrome-linked-list/submissions/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        
        ListNode slow= head;
        ListNode fast = head;
        // middle of the ll
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reversing the ll
        ListNode curr = slow, prev = null, next = null;
        while(curr.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //breaking the middle 
        curr.next = prev;
        //checking if it is palindrome
        ListNode temp1 = head, temp2 = curr;
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
        
    }
}
