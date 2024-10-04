/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool hasPathSum(TreeNode* root, int targetSum) {
        if(root == NULL) return false;
        int sum =0;
        bool ans = helper(root,targetSum,sum);
        return ans;
    }

    bool helper(TreeNode* root, int targetSum, int sum){
        if(root == NULL) return false;
        sum += root->val;
        if(root->left == NULL && root->right == NULL){
            if(sum == targetSum) return true;
            else return false;
        }

        bool lefty = helper(root->left,targetSum ,sum);
        bool righty = helper(root->right,targetSum,sum);
        return lefty || righty;
    }
};
