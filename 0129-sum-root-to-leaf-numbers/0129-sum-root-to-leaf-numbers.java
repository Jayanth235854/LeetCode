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
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        int[] totalSum = new int[1];
        dfs(root, 0, totalSum);
        return totalSum[0];
    }
    private void dfs(TreeNode node, int currentSum, int[] totalSum) {
        if (node == null)
            return;
        currentSum = currentSum * 10 + node.val;
        if (node.left == null && node.right == null) {
            totalSum[0] += currentSum;
            return;
        }
        dfs(node.left, currentSum, totalSum);
        dfs(node.right, currentSum, totalSum);
    }
}