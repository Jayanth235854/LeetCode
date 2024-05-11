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
    String str ="";
    public void helper(TreeNode root, String curr){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
           curr =  ((char)(root.val+97))+""+curr;
           if(str.equals("")){
            str =curr;
           } else {
                if((curr.compareTo(str))<0){
                str = curr;
            }
           }
            System.out.println(curr);
            return ;
        }
        String temp =  ((char)(root.val+97))+""+curr;
        System.out.println(temp);
        helper(root.left,temp );
        helper(root.right,temp );
    }
    public String smallestFromLeaf(TreeNode root) {
       helper(root,"");
       return str;
    }
}