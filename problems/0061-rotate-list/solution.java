/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int len = length(temp);
        k=k%len;
        return solve(temp,k);
    }

    private ListNode solve(ListNode head, int k){
        if(k == 0) return head;
        ListNode secondLast = findSecondLast(head);
        secondLast.next.next = head;
        head = secondLast.next;
        secondLast.next = null;
        return solve(head,k-1);
    }

    private int length(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    private ListNode findSecondLast(ListNode head) {
        ListNode temp = head;

        while(temp.next.next!=null){
            temp = temp.next;
        }
        return temp;
    }


}
