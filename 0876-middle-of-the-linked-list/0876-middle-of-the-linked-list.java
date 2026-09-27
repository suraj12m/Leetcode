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
    public ListNode middleNode(ListNode head) {
        // if(head.next==null)
        //     return head;
        ListNode turr=head;
        ListNode hare=head;
        while(hare != null && hare.next != null){
            hare=hare.next.next;
            turr=turr.next;
        }
        
            return turr;
    }
}