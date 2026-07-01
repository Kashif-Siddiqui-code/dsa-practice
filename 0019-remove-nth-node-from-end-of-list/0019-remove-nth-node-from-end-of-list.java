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
        ListNode fast = head;
        ListNode slow = head;
        // Move fast n times ahead
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        // If first node is to be deleted
        if(fast == null){
            return head = head.next;
        }
        else{
            // Move fast & slow by 1
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            // Delete the node
            slow.next = slow.next.next;
        }
        return head;
    }
}