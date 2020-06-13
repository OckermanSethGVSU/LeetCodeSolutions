/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// O(n) solution
public class Solution {
    public boolean hasCycle(ListNode head) {
        // use a set so that no duplicates are possible
        Set<ListNode> knownNodes = new HashSet<>();
        
        // Node to use in loops
        ListNode curr = head;
        
        // keep going until node is empty meaning the list has ended
        while(curr != null){
            // if the value is already there, it must have looped so return true
            if(knownNodes.contains(curr)){
                return true;
            }
            // otherwise hasn't been seen before, add to list
            else{
                knownNodes.add(curr);
            }
            // advance list 
            curr = curr.next;
        }
        // if we reached the end of the list and nothing contains, it must not loop, return false
        return false;
    }
}
