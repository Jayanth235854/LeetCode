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
    public ListNode doubleIt(ListNode head) {
        if(head.val > 4){
            head = new ListNode(0, head);
        }
        for(ListNode node = head; node != null; node = node.next){
            node.val = node.val * 2%10;
            if(node.next != null && node.next.val > 4){
                node.val++;
            }
        }
        return head;
    }
}