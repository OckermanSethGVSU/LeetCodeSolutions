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
    public ListNode reverseList(ListNode head) {
        // keep track of the one before so I can point to it
        ListNode prev = null;
        // current node we are working with
        ListNode current = head;
        // go until there are no more nodes
        while (current != null){
            // hold the one after current for the end
            ListNode temp = current.next;
            
            // currents next has to be the prev one
            current.next = prev;
            
            // advance previous
            prev = current;
            
            // advance current 
            current = temp;
        }
        return prev;
    }
}
