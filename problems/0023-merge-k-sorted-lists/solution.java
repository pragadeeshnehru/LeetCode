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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode list : lists) {
            if(list != null) {
                queue.offer(list);
            }
        }
        ListNode result = new ListNode();
        ListNode temp = result;
        while(!queue.isEmpty()) {
            ListNode top  = queue.poll();
            temp.next = top;
            temp = temp.next;

            if(top.next != null){
                queue.offer(top.next);
            }
        }

        return result.next;
    }
}
