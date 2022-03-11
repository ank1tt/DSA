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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // create a dummy node.
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        
        int carry = 0;
        // iterate through thr loop.
        while(l1 != null || l2 != null || carry == 1){
            
            int sum = 0;
            //check if l1 is not null, if not null add the value in sum.
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
         //check if l2is not null, if not null add the value in sum.
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            // add carry to the sum.
            sum += carry;
            carry = sum/10;                         // get the value of carry
            ListNode newNode = new ListNode(sum %10);      //create a node of the value sum % 10 
            temp.next = newNode;                      // connect it with the previous Node.
            temp = temp.next;
            
        }
        return dummy.next;                       //retur head next to dummy.
    }
}
