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
        //TODO This could likely use bitwise stuff to get to an O(1) solution; Current O(n^2)
        //TODO I also believe I can get it down to O(n) scanning it is as a string and then using parseInt with a base 2
        
        // node to help me determine size of list
        ListNode sizeL = head;
        // int to keep track of size
        int size = 0;
        // go until sizeD is null
        while(sizeL != null){
            ++size;
            sizeL = sizeL.next;
        }
        
        // node to scan binary to value with simple math
        ListNode current = head;
        // sum of binary
        int sum = 0;
        // you are reading left to right, so start at the highest (size -1 b/c it is zero indexed)
        int i = size - 1;
        
        // keep going until current is null and list is done
        while (current != null){
            // if == 1, add 2^i meaning add 2 to the power of the place it is in
            if(current.val == 1){
                sum += Math.pow(2,i);
                // adv the list and take i down to reflect we moved a power to the right
                --i;
                current = current.next;
            }
            // otherwise is 0 but we stil need to keep track of where we are in the list
            else{
                // still adv list and lower i to reflect our shift to the right
                --i;
                current = current.next;
            }
        }
        // give them back what they asked for :)
        return sum;
    }
}
