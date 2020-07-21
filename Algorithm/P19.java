/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) return null;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode q = newHead;
        ListNode p = newHead;
        for(int i=0;i<n;i++) q = q.next;
        while(q.next != null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return newHead.next;

    }
}