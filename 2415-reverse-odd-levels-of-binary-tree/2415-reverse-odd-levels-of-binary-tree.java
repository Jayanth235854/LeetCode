/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=0;
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return null;
        reverse(root.left, root.right,1);
        return root;
    }
    public void reverse(TreeNode a,TreeNode b,int level){
        if(a==null && b==null)return;
        if(level%2!=0){
            int temp=a.val;
            a.val=b.val;
            b.val=temp;
        }
        reverse(a.left,b.right,level+1);
        reverse(a.right,b.left,level+1);
    }
}