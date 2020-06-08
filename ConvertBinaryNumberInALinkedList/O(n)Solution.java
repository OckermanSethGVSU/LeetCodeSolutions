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
    public int getDecimalValue(ListNode head) {
        /*
        * After testing, the O(n) solution using strings is some how slower than my O(n^2) solution that uses ints
        * I will have to look into this more
        */
        
        // node to scan binary into string and said string; using string buffer for more efficent concat 
        ListNode current = head;
        StringBuffer answ = new StringBuffer();
        
        // keep going until current is null and list is done
        while (current != null){
            answ.append(current.val);
            current = current.next;
        }
        // if I change the base to 2 I don't need any fancy math b/c it will do it for me 
        // change back to normal string to have access to more standard lib to convert to int
        return Integer.parseInt(answ.toString(),2);
    }
}
