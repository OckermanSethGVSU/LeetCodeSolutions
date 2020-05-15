import java.math.BigInteger;
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
    // just coming up with a solution that works would make me proud
    // as it turns out, first year student's still have a lot to learn; this solutions efficency 
    // is going to be awful, but a solution is better than no solution 
   
    public ListNode addTwoNumbers(ListNode x1, ListNode x2) {
        // size of both LL respectively 
        int trackerFirstList = 0;
        int trackerSecondList = 0;
        
        // store original head for later
        ListNode headX1 = x1;
        ListNode headX2 = x2;
        
        // variables for both the linked list's numberical value
        String first = "";
        BigInteger firstSum = new BigInteger("0");
        
        String second = "";
        BigInteger secondSum = new BigInteger("0");

        // arrays for first and second list
        int[] firstA;
        int[] secondA;
        
        // final sum var, string, and array
        int[] formatted;
        BigInteger sum;
        String finalS;
        // how many; add 1 at the end b/c of nature of LL
        while(x1.next != null){
            x1 = x1.next;
            ++trackerFirstList;
            }
        ++trackerFirstList;
        while(x2.next != null){
            x2 = x2.next;
            ++trackerSecondList;
        }
        ++trackerSecondList;
        
        firstA = new int[trackerFirstList];
        secondA = new int[trackerSecondList];
        
        // scan into two arrays
        for(int i = 0; i < firstA.length; ++i){
           firstA[i] = headX1.val;
           headX1 = headX1.next;   
        }
        
        for(int i = 0; i < secondA.length; ++i){
           secondA[i] = headX2.val;
           headX2 = headX2.next;  
        }
        
        
        // to a string
        for(int i = firstA.length -1; i >= 0; --i){
            int temp = firstA[i];
            first += Integer.toString(temp);
        }
        
         for(int i = secondA.length -1; i >= 0; --i){
            int temp = secondA[i];
            second += Integer.toString(temp);
        }
        
        // I will make it work no matter the length
        firstSum = new BigInteger(first);
        secondSum = new BigInteger(second);
        sum = firstSum.add(secondSum);
        
        finalS = sum.toString();
        
        // reverse order of string for formatting
        formatted = new int[finalS.length()];
        int j = finalS.length() -1;
        for(int i = 0; i < finalS.length(); ++i ){
            formatted[i] = Character.getNumericValue(finalS.charAt(j));
            --j;
        }
    
        ListNode head = new ListNode();
        ListNode before = new ListNode();
        ListNode current = new ListNode();
        
        System.out.println(formatted.length);
        for(int i = 0; i < formatted.length; ++i){
            if(i == 0){
                head = new ListNode(formatted[i],null);
                before = head;
            }
            else{
                current = new ListNode(formatted[i],null);
                before.next = current;
                before = current;
            }
            
            }    
            
         return head;   
        }
        
        
 }
