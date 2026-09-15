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
    public void reorderList(ListNode head) {
        // reach to mid
        ListNode slow=head, fast=head.next;  
        while(fast!=null && fast.next!=null) {
            slow = slow.next; 
            fast = fast.next.next;
        }
        // System.out.println("slow: " + slow.val); 
        fast = slow.next; 
        slow.next = null; 
        ListNode prev = null; 

        // reverse from mid till end
        while(fast!=null){
            ListNode temp = fast.next; 
            fast.next = prev; 
            prev = fast; 
            fast = temp; 
        }


        // merge two lists
        ListNode first = head; 
        ListNode second = prev; 
        while(second!=null) {
           ListNode temp1 = first.next; 
           ListNode temp2 = second.next; 
           first.next = second; 
           second.next = temp1;

           first = temp1;
           second = temp2;  
        }
    }
}
