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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr=head;
        ListNode prev=null;
        ListNode nxt;

        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            if(nxt==null){
                break;
            }
            prev=curr;
            curr=nxt;
            
        }
        return curr;


    }
}