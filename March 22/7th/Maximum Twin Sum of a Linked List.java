// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
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
    // function to find the mid of the list
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // function to reverse the list.
    public ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        
        ListNode middle = mid(head);
        ListNode newHead = middle.next;
        //breaking the first half of ll.
        middle.next = null;
        // reversing the 2nd half of ll and giving it a  new head.
        newHead = reverseList(newHead);
        
        
        ListNode temp1 = head;
        ListNode temp2 = newHead;
        int max = Integer.MIN_VALUE;
        while(temp1 != null){
            max = Math.max(temp1.val + temp2.val, max);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return max;
    }
}
