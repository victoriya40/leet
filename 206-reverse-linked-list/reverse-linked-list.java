/*class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        while(current!=null){
            ListNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        return previous;
    }
}*/
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // next node save
            curr.next = prev;          // link reverse
            prev = curr;               // prev move
            curr = next;               // curr move
        }

        return prev;
    }
}
