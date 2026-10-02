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
import java.util.ArrayList;
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // ArrayList<Integer> l=new ArrayList<>();
        // ListNode curr=head;
        // while(curr != null){
        //     l.add(curr.val);
        //     curr=curr.next;
        // }
        // int k1=k-1;
        // int k2=l.size()-k;
        // int temp=l.get(k1);
        // l.set(k1,l.get(k2));
        // l.set(k2,temp);
        // curr=head;
        // for(int i=0;i<l.size();i++){
        //     curr.val=l.get(i);
        //     curr=curr.next;
        // }
        // return head;

        ListNode fast=head;
        for(int i=1;i<k;i++)
            fast=fast.next;
        
        ListNode k1=fast;

        ListNode slow=head;
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp=k1.val;
        k1.val=slow.val;
        slow.val=temp;
        return head;
        

    }
}