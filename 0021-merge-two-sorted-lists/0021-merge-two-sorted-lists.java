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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1,l2=list2,node=new ListNode(-1);
        ListNode ans=node;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                node.next=l2;
                l2=l2.next;
            }else{
                node.next=l1;
                l1=l1.next;
            }
            node=node.next;
        }
        if(l1!=null)node.next=l1;
        else if(l2!=null)node.next=l2;
        return ans.next;
    }
}