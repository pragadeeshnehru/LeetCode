
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode odd = head ;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(odd.next!=null && even.next!=null) {
            odd.next = even.next;
            if(even.next == null) even = null;
            else even.next = even.next.next;

            if(odd.next == null) break;
            odd= odd.next;
            even= even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
