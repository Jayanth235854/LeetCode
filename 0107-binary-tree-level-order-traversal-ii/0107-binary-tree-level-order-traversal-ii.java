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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr=new ArrayList();
        if(root==null)return arr;
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                temp.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            arr.add(temp);
        }
        int size=arr.size();
        int i=0,j=size-1;
        System.out.println(arr);
        while(i<j){
            List<Integer> temp=arr.remove(j);
            arr.add(i,temp);
            i++;
        }
        return arr;
    }
}