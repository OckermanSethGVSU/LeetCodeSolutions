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
 * O(n) solution. The idea here is to add each number and then use 
 * a carry variable to catch what goes over 9
 */
class OptimizedSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // head to keep track of the start of the list
    ListNode dummyHead = new ListNode(0);
    // nodes to keep two numbers being added
    ListNode p = l1;
    ListNode q = l2;
    // listNode to worth with
    ListNode curr = dummyHead;
    // int to track when the sum goes over 9
    int carry = 0;
    
    // go until both are null
    while(p != null || q != null){
        // if there is a val in either listNode chain, assign it; otherwise it is zero
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        
        // sum is equal to the 0-9 part of addition 
        int sum = (x + y + carry) % 10;
        
        // carry is equal to the amount over 10
        carry = (x + y + carry) / 10;
        // create a new listnode to put the sum into
        curr.next = new ListNode(sum)
        
        // advance the list
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    
    return dummyHead.next;
}
}
