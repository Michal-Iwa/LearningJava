import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(6);
        l2.next = l3;

        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(2);
        l4.next = l5;
        ListNode l6 = new ListNode(1);
        l5.next = l6;
        ListNode l7 = addTwoNumbers(l1,l4);
    }
     // Definition for singly-linked list.
     public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
        ListNode head = new ListNode(val % 10);
        head.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        if(val>=10) head.next = addTwoNumbers(head.next, new ListNode(1));
        return head;
    }
}
