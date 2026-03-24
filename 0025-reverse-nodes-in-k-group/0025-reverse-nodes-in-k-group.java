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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
    
        while(true){
            ListNode start=prev.next;
            ListNode end=prev;
            for(int i=0;i<k;i++){
                end=end.next;
                if(end==null) return dummy.next;
            }
            ListNode ng=end.next;
            ListNode p=ng,next=start.next,temp=start;
            while(temp!=ng){
                temp.next=p;
                p=temp;
                temp=next;
                if(next!=null) next=next.next;
            }
            prev.next=end;
            prev=start;
        }
    }
}
