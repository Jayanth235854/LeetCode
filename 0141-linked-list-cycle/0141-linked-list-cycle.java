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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> a=new HashSet<>();
        ListNode th=head;
        while(th!=null){
            if(a.contains(th))return true;
            a.add(th);
            th=th.next;
        }
        return false;
    }
}