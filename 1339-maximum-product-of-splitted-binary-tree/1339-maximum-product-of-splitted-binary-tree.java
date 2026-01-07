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
    long total=0,max=0;
    public int maxProduct(TreeNode root) {
        total=total(root);
        subSum(root);
        return (int)(max%1000000007);
    }
    public long total(TreeNode root){
        if(root==null) return 0;
        return root.val + total(root.left) + total(root.right);
    }
    public long subSum(TreeNode root){
        if(root==null) return 0;
        long left = subSum(root.left);
        long right = subSum(root.right);
        long sum=root.val + left + right;
        max=Math.max(max,(total-sum)*sum);
        return sum;
    }
}