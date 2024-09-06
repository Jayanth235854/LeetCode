/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> a=new HashSet<>();
        ListNode th=head;
        while(th!=null){
            if(a.contains(th))return th;
            a.add(th);
            th=th.next;
        }
        return null;
    }
}