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
class FindElements {
    HashSet<Integer> set;
    public FindElements(TreeNode root) {
        set = new HashSet();
        dfs(root,0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }

    private void dfs(TreeNode currentNode, int curr) {
        if(currentNode == null) return;
        set.add(curr);
        dfs(currentNode.left, curr * 2 + 1);
        dfs(currentNode.right, curr * 2 +2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
