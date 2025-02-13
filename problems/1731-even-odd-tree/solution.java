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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean even = true;
        while(!queue.isEmpty()) {
            int n = queue.size();
            int preVal = even ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while(n-- > 0) {
                root = queue.poll();
                if(even && (root.val % 2 ==0 || root.val <= preVal)) return false;
                if(!even && (root.val % 2 == 1 || root.val >= preVal)) return false;
                preVal = root.val;
                if(root.left != null) queue.add(root.left);
                if(root.right != null) queue.add(root.right);
            }
            even = !even;
        }
        return true;
    }
}
