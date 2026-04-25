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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=length(head);
        if(c==1){
            head=null;
            return head;
        }
        if(c-n==0){
            head=head.next;
            return head;
        }
        ListNode t=head;
        for(int i=1;i<=c;i++){
            if(i==c-n){
                t.next=t.next.next;
                break;
            }
            t=t.next;
        }
        return head;
    }
    public int length(ListNode head){
        ListNode t=head;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        return c;
    }
}