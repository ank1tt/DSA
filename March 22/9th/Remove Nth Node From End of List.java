// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        int len = 0;
        // find the length of the linked list 
        while(curr != null){
            len++;
            curr = curr.next;
        }
        // nth node from the end is the (pos) node from the start.
        int pos = len - n;
        if(pos == 0){
            return head.next;
        }
        // take a current pointer.
        ListNode temp = head;
       int i = 1;
        // iterate till the pos-1 element and connect it with the next to next element.
        while(temp != null){
            if(i == pos){
                temp.next = temp.next.next;
                break;
            }
            i++;
            temp = temp.next;
        }
        return head;
    }
}
