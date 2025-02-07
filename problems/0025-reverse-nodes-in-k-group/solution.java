/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        int n = size(head);

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prevEnd = dummy;
        while(n>=k){
            ListNode prev = null;
            ListNode curr = prevEnd.next;
            ListNode next = null;
            ListNode groupStart = curr;

            for(int i =0;i<k;i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            prevEnd.next = prev;
            groupStart.next = curr;

            prevEnd = groupStart;
            n -= k;
        }
        return dummy.next;
    }

    int size(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp!= null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
