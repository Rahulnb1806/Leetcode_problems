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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode mid=mid(head);
        ListNode rigthlist=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode rigt=sortList(rigthlist);
        return merge(left,rigt);
    }
    public ListNode mid(ListNode head)
    {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null&&f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode d=new ListNode();
        ListNode tail=d;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val)
            {
                tail.next=l1;
                l1=l1.next;
            }
            else
            {
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        tail.next=(l1!=null)?l1:l2;
        return d.next;
    }
}