/*class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  
        ListNode current = head;
    
        
        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }
}*/
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode nextnode = head.next;
            head.next = null;
            ListNode rest = reverseList(nextnode);
            nextnode.next = head;
            return rest; 
        }
    }
}
