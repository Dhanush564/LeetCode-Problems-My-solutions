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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null){
            return null;
        }
        ListNode head1=head;
        ListNode head2=head.next;
        ListNode t1=head1;
        ListNode t2=head2;

        while(t2!=null && t2.next!=null){

            t1.next=t2.next;
            t1=t1.next;
            t2.next=t1.next;
            t2=t2.next;
        }
        t1.next=head2;

        return head1;
    }
}