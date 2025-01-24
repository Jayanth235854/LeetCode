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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==1)return lists[0];
        if(n==0)return null;
        for(int i=1;i<n;i++){
            ListNode a=lists[i-1];
            ListNode b=lists[i];
            ListNode node=new ListNode(-1);
            ListNode c=node;
            while(a!=null && b!=null){
                if(a.val<b.val){
                    node.next=a;
                    a=a.next;
                }else{
                    node.next=b;
                    b=b.next;
                }
                node=node.next;
            }
            if(a!=null)node.next=a;
            if(b!=null)node.next=b;
            lists[i]=c.next;
        }
        return lists[n-1];
    }
}