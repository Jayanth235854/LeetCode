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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode temp= head;
        int row = 0, col=0;
        int[][] ans = new int[m][n];
        for(int[] a:ans)Arrays.fill(a,-1);

        int t1 = 1, t2=1, t3=0, t4=0;
        boolean turn = true;
        while(temp != null){
            if(col == n || row == m || col<t3 || row<t4){turn = !turn;}
            if(col<t3){t1 = 1;col+=1;row-=1;m--;}
            else if(row<t4){t2 = 1;row+=1;col+=1;t3++;}
            else if(col == n){t1 = -1;col -=1;row+=1;t4++;}
            else if(row == m){t2 = -1;row-=1;col-=1;n--;}

            if(turn){ans[row][col] = temp.val;col+=t1;}
            else if(!turn){ans[row][col] = temp.val;row+=t2;}
            temp = temp.next;
        }
        return ans;
    }
}