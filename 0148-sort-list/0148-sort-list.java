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
    public ListNode sortList(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        if(arr.size()<2)return head;
        Collections.sort(arr);
        System.out.println(arr);
        ListNode node=new ListNode(arr.get(0));
        ListNode ans=node;
        for(int i=1;i<arr.size();i++){
            ListNode newNode =new ListNode(arr.get(i));
            node.next=newNode;
            node=node.next;
        }
        return ans;
    }
}