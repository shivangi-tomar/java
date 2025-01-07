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
 private int getLength(ListNode node) {
  int length = 0;
  while (node != null) {
   length++;
   node = node.next;
  }
  return length;
 }
 private ListNode addLists(ListNode l1, ListNode l2, int[] carry) {
  if (l1 == null) return null;
  ListNode nextNode = addLists(l1.next, l2.next, carry);
  int total = l1.val + l2.val + carry[0];
  carry[0] = total / 10;
  return new ListNode(total % 10, nextNode);
 }
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  int len1 = getLength(l1);
  int len2 = getLength(l2);
  while (len1 < len2) {
   l1 = new ListNode(0, l1);
   len1++;
  }
  while (len2 < len1) {
   l2 = new ListNode(0, l2);
   len2++;
  }
  int[] carry = new int[1];
  ListNode result = addLists(l1, l2, carry);
  if (carry[0] > 0) {
   result = new ListNode(carry[0], result);
  }
  return result;
 }
}