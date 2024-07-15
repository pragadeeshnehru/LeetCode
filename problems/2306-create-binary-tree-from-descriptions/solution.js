/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[][]} descriptions
 * @return {TreeNode}
 */
var createBinaryTree = function(descriptions) {
    let childrenSet = new Set();
    let childrenHashMap = new Map();

    for(let [parent,child,isLeft] of descriptions ){
        if(!childrenHashMap.has(parent)) {
            childrenHashMap.set(parent, [-1, -1]);
        }

        childrenSet.add(child);

        if(isLeft === 1) {
            childrenHashMap.get(parent)[0] = child;
        } else {
            childrenHashMap.get(parent)[1] = child;
        }
    }

    let root;
    for (let parent of childrenHashMap.keys()) {
        if(!childrenSet.has(parent)){
            root = parent;
            break;
        }
    }

    return constructTree(root,childrenHashMap);
};

function constructTree(head, childrenHashMap){
    let newNode = new TreeNode(head);
    if(childrenHashMap.has(head)){
        let [left,right] = childrenHashMap.get(head);
        if (left !== -1) {
            newNode.left = constructTree(left, childrenHashMap);
        }
        if (right !== -1) {
            newNode.right = constructTree(right, childrenHashMap);
        }
    }
    return newNode;
}
