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
        // reversed the LL
        ListNode h1 = reverseLL(l1);
        ListNode h2 = reverseLL(l2);
       //  stack to store the sum value.
        Stack<Integer> ans = new Stack<>();
        
        int carry = 0;
        
        while(h1 != null || h2 != null){
            int sum = 0;
            if(h1 != null){             // check if the list is not null we add its value.
                sum += h1.val;
                h1 = h1.next;
            }
            if(h2 != null){
                sum += h2.val;
                h2 = h2.next;
            }
            
            sum += carry;              // adding carry to the sum if there is any carry.
             carry = sum/10;            
            ans.push(sum % 10);        // pushing the org.sum value after removing the carry.
        }
        if(carry > 0){
            ans.push(carry);           //if there is any carry left in the end push it into stack.
        }
    
        ListNode dummy = new ListNode(-1);       //dummy node
        ListNode temp = dummy;
        while(!ans.isEmpty()){                   // until the stack is empty we pop the elements one by one and keep adding it to the LL.
            temp.next = new ListNode(ans.pop());
             temp = temp.next;      
        }
        return dummy.next;                        // returning the next of the dummy node.
    }
    //funtion to reverse the LL
    public ListNode reverseLL(ListNode head){
        if(head.next == null){
            return head;
        }
        
        ListNode curr = head, prev = null, next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
      return prev;
    }
}
