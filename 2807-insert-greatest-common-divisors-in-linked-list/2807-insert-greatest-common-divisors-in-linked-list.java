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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;
        ListNode th=head;
        while(th!=null && th.next!=null){
            int a=th.val, b=th.next.val;
            int c=gcd(a,b);
            ListNode l=new ListNode(c,th.next);
            th.next=l;
            th=l.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        while(a!=b){
            if(a>b)a-=b;
            else b-=a;
        }
        return a;
    }
}