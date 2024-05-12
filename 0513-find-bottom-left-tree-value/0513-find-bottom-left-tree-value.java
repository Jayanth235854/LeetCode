class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return -1;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode leftmost = root;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            leftmost = queue.peek();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        
        return leftmost.val;
    }
}