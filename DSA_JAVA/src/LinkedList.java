import java.util.*;

public class LinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // speed => x
            fast = fast.next.next; // speed => 2x
        }
        return slow;
    }
}