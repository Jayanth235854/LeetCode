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
    List<List<Integer>> ans=new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> a=new ArrayList();
        path(root, targetSum,0,a);
        return ans;
    }
    public void path(TreeNode r, int t,int sum, List<Integer> a){
        if(r==null)return;
        sum+=r.val;
        a.add(r.val);
        if(sum==t && r.right==null && r.left==null){
            ans.add(new ArrayList(a));
            a.remove(a.size()-1);
            return;
        }
        path(r.left,t,sum,a);
        path(r.right,t,sum,a);
        a.remove(a.size()-1);
    }
}