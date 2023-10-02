class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        //create dummy node so left would end up before deleted node
        dummy.next=head;

        //initialize two pointers
        ListNode left = dummy;
        ListNode right = head;

        //maintain a constant distance of n between them
        while(n>0){
            right = right.next;
            n--;
        }
        // when right reaches null left points to location before delete node
        while(right != null){
            left = left.next;
            right = right.next;
        }
        // update left
        left.next = left.next.next;
        
        return dummy.next;
    }
}
