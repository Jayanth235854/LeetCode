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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList();
        Deque<TreeNode> q=new ArrayDeque();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode cur=q.poll();
                if(cur.val>max)max=cur.val;
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
            }
            ans.add(max);
        }
        return ans;
    }
}