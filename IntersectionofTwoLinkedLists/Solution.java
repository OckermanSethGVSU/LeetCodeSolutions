/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // is a list is null no intersection point 
        if (headA == null || headB == null) {
            return null;
        }
        
        // get lengths
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        
        // get the lists to the same starting point  
        for(int i = 0; i < Math.abs(lengthA - lengthB); ++i){
            if (lengthA > lengthB){
                headA = headA.next;
            }
            else{
                headB = headB.next;   
            }
            
        }
        // keep going until we reach the end of the lists
        while(headA != null && headB != null){
                // if they match, its the start of the matchups so return it
                if(headA == headB){
                    return headA;
                }
                // if they don't, advance the list
                else{
                    headA = headA.next;
                    headB = headB.next;
                }
                
            }
        // no matches found. Must be null
        return null;
        
}
 public int getLength(ListNode head) {
        int len = 0;
        
        while (head != null) {
            head = head.next;
            len++;
        }
        
        return len;
    }
}
