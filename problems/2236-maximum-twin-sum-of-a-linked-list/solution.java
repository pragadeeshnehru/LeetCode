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
    public int pairSum(ListNode head) {
        int sum =0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        } 

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        int maxSum = Integer.MIN_VALUE;
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            int currentSum = firstHalf.val + secondHalf.val;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxSum;

    }
}
