// https://leetcode.com/problems/merge-nodes-in-between-zeros/
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
    public ListNode mergeNodes(ListNode head) {
       // make 3 nodes one for traversing the list and one for storing the head of new list. and tail to traverse and connect the new List.
        ListNode temp = head.next;
         ListNode newH = null;
        ListNode tail = null;
        int sum = 0;     //sum to store the value between zeroes.
        
        while(temp != null){
            if(temp.val != 0){
                sum += temp.val;  // adding the values when its not equals to 0.
            }else {
                if(newH == null){   // if head  is null we set a new head and tail.
                    newH = new ListNode(sum);
                    tail = newH;
                }else{
                    tail.next = new ListNode(sum);  //else we create a new node and connect it with the previous node.
                    tail = tail.next;
                }
                sum = 0;   //making the sum 0 after encountering a 0.
            }
            temp = temp.next;
        }
        return newH;   //returning the new Head of the LL.
    }
}
