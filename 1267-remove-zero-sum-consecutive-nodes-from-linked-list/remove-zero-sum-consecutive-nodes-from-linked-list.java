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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> l=new HashMap<>();
        int presum=0;
        ListNode initial=new ListNode(0);
        initial.next=head;
        l.put(0,initial);
        while(head!=null)
        {
            presum+=head.val;
            if(!l.containsKey(presum))
            {
                l.put(presum,head);
            }
            else{
                ListNode start=l.get(presum);
                ListNode temp=start;
                 int sum = presum;
                while (temp != head) {
                    temp = temp.next;
                    sum += temp.val;
                    if (temp != head) {
                        l.remove(sum);
                    }
                }
                start.next=head.next;
            }
            head=head.next;
        }
        return initial.next;
    }
}