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

 // Approach:Three Pointers - Traverse the linked list once while reversing each node's next pointer. TC - O(n) SC - O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next; // save the next node
            curr.next = prev; // reverse the pointer
            prev = curr; // Move prev
            curr = next; // Move curr
        }
        return prev;
    }
}