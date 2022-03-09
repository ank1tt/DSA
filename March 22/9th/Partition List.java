// https://leetcode.com/problems/partition-list/
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
  public ListNode partition(ListNode head, int x) {
    if(head==null || head.next == null) return head;
    
      ListNode less = null;                    //for the nodes that are less than x
   
      ListNode lessHead= null;
    
    
      ListNode large = null;                    //for the nodes that are greater than or equal to x
    
      ListNode largeHead = null;
    
    while(head!=null){           //putting values to lists according to conditions
        if(head.val < x){
            if(lessHead == null){
                lessHead = new ListNode(head.val);
                less = lessHead;
            }else{
                less.next = new ListNode(head.val);
                less = less.next;
            }
        }else{
            if(largeHead == null){
                largeHead = new ListNode(head.val);
                large = largeHead;
            }else{
                large.next = new ListNode(head.val);
                large = large.next;
            }
        }
        
        head=head.next;
    }
    if(less !=null){             // if there are values found less than x then merge both lists-- list1 and list2
        less.next = largeHead;
    }else{                        // if we dont found any value less than x then simply return list2
        return largeHead;
    }
    
    return lessHead;
 }
}
