

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //one node to connect the linked list to 2nd list and other to store the reference of b+1 node.
        ListNode temp1 = list1, temp2 = list1;
        
        // traverse till a-1
        for(int i = 0; i < a-1; i++){
            temp1 = temp1.next;
        }
        //traverse till one node node next to b
        for(int i = 0; i < b+1; i++){
            temp2 = temp2.next;
        }
        //creating new nodes of the same value as list2 and connecting them.
        while(list2 != null){
           temp1.next = new ListNode(list2.val);
            temp1 = temp1.next;
            list2 = list2.next;
        }
        
        //connecting the last node to the b+1 node in list1. :)
        
        temp1.next = temp2;
        
        return list1;
    }
}
