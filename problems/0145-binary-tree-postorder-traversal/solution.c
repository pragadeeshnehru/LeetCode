/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

 void postorder(struct TreeNode *root, int* num, int* size){
    if(root == NULL) return;
    postorder(root->left,num,size);
    postorder(root->right,num,size);
    num[(*size)++] = root->val;
} 

int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    int* num = (int*)malloc(100*sizeof(int));
    *returnSize = 0;
    postorder(root,num,returnSize);
    return num; 
}

