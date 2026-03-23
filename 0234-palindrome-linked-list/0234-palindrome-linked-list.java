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
    public boolean isPalindrome(ListNode head) {
        ListNode left=head;
        ListNode rigth=mid(head);
        // left.next=null;
        rigth=revers(rigth);
        Dis(left);
        System.out.println();
        Dis(rigth);
        while(left!=null&&rigth!=null)
        {
            if(left.val!=rigth.val)
            return false;
            left=left.next;
            rigth=rigth.next;
        }
        return true;
    }
    public ListNode mid(ListNode head)
    {
        ListNode s=head,f=head;
        ListNode temp=head;
        while(f.next!=null&&f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode revers(ListNode head)
    {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode x=temp.next;
            temp.next=prev;
            prev=temp;
            temp=x;
        }
        return prev;
    }
    public void Dis(ListNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val);
            head=head.next;
        }
    }
}