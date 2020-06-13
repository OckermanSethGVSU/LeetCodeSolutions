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
        /*
        * I believe this is O(n), it enters half the length of n 3 times so it could be written as (3n/2)
        * but as n approaches infinity (3/2) makes a really small difference
        * TODO double check how O(n) notation handles that
        * Fixed: I was correct, it is O(n)
        
        * general idea of this approach is as follows:
        *   go to the middle of the number, go backwards from the middle of the number
        *   if the numbers contained in the node are the same both directions it is a palidrome
        *   working with half the number works b/c by definition the first half of a palidrome must be the same
        *   as the second for it to work 
        */
        
        // node to get the the end of the list
        ListNode fast = head;
        // node to get to the middle of the list
        ListNode slow = head;
        
        // adv fast node twice for each time the slow node moves one, this will put the slow node in the middle
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // reset fast node to start of list
        fast = head;
        // use outside method to reverse the linked list of the slow node, this creates our potential palindrome
        slow = reverseList(slow);
        
        // if they ever don't equal each other, it must not be a palindrome; return false
        while(fast != null && slow != null){
            if(fast.val != slow.val) return false;
                fast = fast.next;
                slow = slow.next;
        }
        // if you made it here, it is a palidrome, return true
        return true;
        
    }
    
    public ListNode reverseList(ListNode head){
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
