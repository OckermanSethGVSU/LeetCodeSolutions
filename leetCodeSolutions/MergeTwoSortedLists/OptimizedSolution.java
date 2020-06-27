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
class OptimizedSolution {
    public ListNode mergeTwoLists(ListNode x1, ListNode x2) {
        // dummy head
        ListNode head = new ListNode(0);
        
        // this will hold the current node I want
        ListNode current = head;
        
        // the nodes from each list up to bat
        ListNode x1Node = x1;
        ListNode x2Node = x2;
        
        // keep going until one node is null to prevent errors
        while (x1Node != null && x2Node != null){
            
            // if x1 val bigger insert
            if(x1Node.val < x2Node.val){
                // the current nodes next is now x1
                current.next = x1Node;
                // x1 is the next in its list now
                x1Node = x1Node.next;
            }
                // must be smaller
            else{
                // current nodes next is now x2
                current.next = x2Node;
                // x2 is now the next node in the list
                x2Node = x2Node.next;
            }
            
            // advance the current each time
            current = current.next;
        }
        
        // there is always one left over element
        // find out which one and add it to the list
        if(x1Node !=null){
            current.next = x1Node;
        }
 
        if(x2Node!=null){
            current.next = x2Node;
        }
          // the dummy head's next was always pointing to the start          
         //of the list  
          return head.next;
        }
    }

