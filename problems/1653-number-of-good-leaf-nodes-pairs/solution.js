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
 * @param {number} distance
 * @return {number}
 */
var countPairs = function(root, distance) {
    if (!root) return 0;
    let ans =0;

    const dfs = (node) => {
        if(!node) return [];
        if(!node.left && !node.right) return [0];

        const leftDistances = dfs(node.left);
        const rightDistances = dfs(node.right);

        for(const l of leftDistances) {
            for(const r of rightDistances) {
                if(l + r + 2 <= distance) {
                    ans++;
                }
            }
        }

        const distances = [];
        for(const l of leftDistances) distances.push(l+1);
        for(const r of rightDistances) distances.push(r+1);

        return distances;
    }

    dfs(root);
    return ans;
};
