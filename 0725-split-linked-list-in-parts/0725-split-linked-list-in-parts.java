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

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode th = head;
        int count=0;
        while (th != null) {
            count++;
            th = th.next;
        }
        ListNode[] ans = new ListNode[k];
        int partSize = count / k;
        int extraNodes = count % k;
        th = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = th;
            ListNode partTail = null;
            int currentPartSize = partSize + (extraNodes > 0 ? 1 : 0);
            if (extraNodes > 0) extraNodes--;

            for (int j = 0; j < currentPartSize; j++) {
                partTail = th;
                if (th != null) th = th.next;
            }
            if (partTail != null) {
                partTail.next = null;
            }
            ans[i] = partHead;
        }
        return ans;
    }
}