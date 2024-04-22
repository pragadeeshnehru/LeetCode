class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(root.val == key) {
            if(root.left == null && root.right == null) return null;
            if(root.left != null && root.right == null) return root.left;
            if(root.left == null && root.right != null) return root.right;
            if(root.left !=null && root.right != null){
                root.val = findMin(root.right).val;
                root.right = deleteNode(root.right,root.val);
                return root;
            }
        }

        if(root.val > key) root.left = deleteNode(root.left,key);
        else root.right = deleteNode(root.right,key);

        return root;
    }

    public TreeNode findMin(TreeNode root) {
        if(root == null || root.left == null) {
            return root;
        }
        return findMin(root.left);
    }
}
