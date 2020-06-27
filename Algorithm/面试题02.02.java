/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode pre = head;
        for(int i=1;i<k;i++){
            pre = pre.next;
        }
        while(pre.next != null){
            head = head.next;
            pre = pre.next;
        }
        return head.val;
    }
}