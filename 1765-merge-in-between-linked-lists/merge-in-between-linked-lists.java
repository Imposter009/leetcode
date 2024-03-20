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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list=list1;
        int l=0,r=a;
        while(list1!=null && l<a-1)
        {
            //to reach the ath node in list1 
            list1=list1.next;
            l++;
        }
        ListNode temp=list1.next;
        list1.next=list2;
        ListNode temp1=list2;
        while(temp1.next!=null)
        {
            //to reach end of the list2
            temp1=temp1.next;
        }
        while(temp!=null && r<=b)
        {
            // to reach the end of the part which we have to remove from list1
            temp=temp.next;
            r++;
        }
        temp1.next=temp;
        return list;        
    }
}