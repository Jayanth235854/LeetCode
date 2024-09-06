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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode oddHead = new ListNode(0); // Dummy node for odd list
        ListNode evenHead = new ListNode(0); // Dummy node for even list
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode current = head;
        boolean isOdd = true;

        while (current != null) {
            if (isOdd) {
                odd.next = current;
                odd = odd.next;
            } else {
                even.next = current;
                even = even.next;
            }
            isOdd = !isOdd;
            current = current.next;
        }
        even.next = null; // End the even list
        odd.next = evenHead.next; // Merge odd list with even list
        return oddHead.next;
    }
}