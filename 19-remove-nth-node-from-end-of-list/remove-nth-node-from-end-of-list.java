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
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        if (n == length) {
            head = head.next;
            return head;
        }
        current = head;
        for (int i = 0; i < length - n - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    return head;
    }
}
/*
maine galti ki thi while loop me. current.next!=null kr diya tha jiski wajha se length ki value 1 kam a rahi thi.
*/
---------------------------------------------------------------------------------------------------------------------------------------
 
