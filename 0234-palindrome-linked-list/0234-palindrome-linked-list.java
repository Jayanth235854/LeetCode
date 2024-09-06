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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> a=new Stack<>();
        ListNode th=head;
        while(th!=null){
            a.push(th.val);
            th=th.next;
        }
        th=head;
        while(th!=null){
            if(th.val!=a.pop())return false;
            th=th.next;
        }
        return true;
    }
}