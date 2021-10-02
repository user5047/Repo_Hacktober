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

    public static boolean isPalindrome(ListNode head1) {
        ListNode mid = midNode(head1);
        ListNode head2 = mid.next;
        mid.next = null;

        head2 = reverse(head2);

        while(head1 != null && head2 != null) {
            if(head1.val != head2.val) {
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}