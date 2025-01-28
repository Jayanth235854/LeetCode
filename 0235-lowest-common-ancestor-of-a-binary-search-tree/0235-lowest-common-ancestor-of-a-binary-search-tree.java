/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        return help(root,p,q);
    }
    public TreeNode help(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode left= help(root.left,p,q);
        TreeNode right=help(root.right,p,q);
        if(left!=null && right!=null)return root;
        if(left==null)return right;
        if(right==null) return left;
        return null;
    }
}