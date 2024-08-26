bool helper(struct ListNode** front, struct ListNode* back);

bool isPalindrome(struct ListNode* head){
    struct ListNode* front = head;
    return helper(&front, head);

}

bool helper(struct ListNode** front, struct ListNode* back){
    if(back == NULL) return true;
    
    bool equal_so_far = helper(front, back->next);
    
    bool value_equal = ((*front)->val == back->val);
    
    *front = (*front)->next;
    return equal_so_far && value_equal;
}
