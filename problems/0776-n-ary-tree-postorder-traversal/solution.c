/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void postorderTraversal(struct Node *root, int* num, int* size){
    if(root == NULL) return;
    for(int i=0;i<root->numChildren;i++){
        postorderTraversal(root->children[i],num,size);
    }
    num[(*size)++] = root->val;
} 

int* postorder(struct Node* root, int* returnSize) {
    int* num = (int*)malloc(10000*sizeof(int));
    *returnSize = 0;
    postorderTraversal(root,num,returnSize);
    return num; 
}
