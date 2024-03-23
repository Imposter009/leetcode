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
    public ListNode reorderList(ListNode head) {
        Stack<ListNode> s=new Stack<>();
        ListNode curr=head;
        while(curr!=null)
        {
            s.push(curr);
            curr=curr.next;
        }
        //storing in stack to reverse the list
        curr=head;
        int i=s.size()/2;
        while(i>0)
        {
            ListNode t=curr.next;
            ListNode p=s.pop();
            curr.next=p;
            curr=t;
            p.next=curr;
            i--;
        }
        curr.next=null;
        //last me self loop ban gaya hoga isliye hum curr.next=null kr rahe hai
        return head;
    }
}