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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,0,targetSum);
    }
    public Boolean path(TreeNode r, int sum, int ts){
        if(r==null)return false;
        sum+=r.val;
        if(sum==ts && r.right==null && r.left==null)return true;
        return path(r.left,sum,ts) || path(r.right,sum,ts);
    }
}