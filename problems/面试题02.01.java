import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null) return head;
        ListNode temp = head;
        Set<Integer> set = new HashSet<>();
        while(temp.next != null){
            if(!set.contains(temp.val)){
                set.add(temp.val);
            }
            if(set.contains(temp.next.val)){
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }
        }
        return head;
    }
}