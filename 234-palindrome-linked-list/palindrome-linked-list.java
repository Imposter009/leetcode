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
        Stack<Integer>s=new Stack<>();
        if(head==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            s.push(slow.val);
            slow=slow.next;
           
        }
        if(fast!=null)slow=slow.next;
        while(slow!=null)
        {
            if(slow.val!=s.pop()) return false;
            slow=slow.next;
        }
        return true;
    }
}