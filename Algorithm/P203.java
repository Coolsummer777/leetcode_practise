/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        head = temp;
        while(temp.next != null){
            if(temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head.next;
    }
}