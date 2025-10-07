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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(head1 != null || head2 != null || carry != 0) {
            int val1 = head1 != null ? head1.val : 0;
            int val2 = head2 != null ? head2.val : 0;

            temp.next = new ListNode((val1+val2+carry)%10);
            carry = (val1+val2+carry)/10;

            head1 = head1 != null ? head1.next : null;
            head2 = head2 != null ? head2.next : null;
            temp = temp.next;
        }
        return dummy.next;
    }
}