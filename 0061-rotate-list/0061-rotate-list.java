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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length & tail
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: make circle
        temp.next = head;

        // Step 3: effective rotations
        k = k % length;
        int end = length - k;

        // Step 4: move to new tail
        while (end-- > 0) {
            temp = temp.next;
        }

        // Step 5: break circle
        head = temp.next;
        temp.next = null;

        return head;
    }
}
