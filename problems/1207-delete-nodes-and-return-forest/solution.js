/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number[]} to_delete
 * @return {TreeNode[]}
 */
var delNodes = function(root, to_delete) {
    let res= {};
    let to_delete_set = new Set(to_delete);
    res[root.val] = root;

    function recursion(parent,cur_node,isleft){
        if(cur_node === null) return;

        recursion(cur_node, cur_node.left,true);
        recursion(cur_node, cur_node.right,false);

        if(to_delete_set.has(cur_node.val)){
            delete res[cur_node.val];

            if (parent !== null) {
                if (isleft) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }

            if (cur_node.left !== null) {
                res[cur_node.left.val] = cur_node.left;
            }
            if (cur_node.right !== null) {
                res[cur_node.right.val] = cur_node.right;
            }
        }
    }
    recursion(null, root, false);

    return Object.values(res);
};
