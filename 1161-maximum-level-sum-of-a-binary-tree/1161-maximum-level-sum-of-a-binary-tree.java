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
    public int maxLevelSum(TreeNode root) {
        long max=root.val;
        int size=1,level=1,ans=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.right!=null)q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
            }
            size=q.size();
            if(sum>max){
                max=sum;
                ans=level;
            }
            level++;
        }
        return ans;
    }
}