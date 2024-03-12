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
    public ListNode removeZeroSumSublists(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        
        int prefixSum =0;
        
        Map<Integer,ListNode> prefixSumToNode =  new HashMap<>();

        for(ListNode current = dummy;current != null; current = current.next) {
            prefixSum += current.val;
            if(prefixSumToNode.containsKey(prefixSum)) {
                ListNode prev = prefixSumToNode.get(prefixSum);
                ListNode toRemove = prev.next;
                int p = prefixSum + (toRemove != null ? toRemove.val : 0);

                while(p != prefixSum){
                    prefixSumToNode.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null ? toRemove.val : 0);
                }

                prev.next = current.next;
            } else {
                prefixSumToNode.put(prefixSum, current);
            }
        }
        return dummy.next;
    }
}
