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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode i = l1;
        ListNode j = l2;

        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;

        while(i != null || j != null || carry == 1) {
            int ival = i == null ? 0 : i.val;
            i = i == null ? null : i.next;

            int jval = j == null ? 0 : j.val;
            j = j == null ? null : j.next;

            int sum = ival + jval + carry;
            int val = sum % 10;
            carry = sum / 10;

            ListNode nn = new ListNode(val);
            temp.next = nn;
            temp = nn;
        }

        ans = reverse(ans.next);
        return ans;
    }

    public static ListNode removeDuplicates(ListNode head) {
        ListNode nhead = new ListNode(-1);
        ListNode temp = nhead, itr = head;

        while(itr != null) {
            if(itr.val != temp.val) {
                temp.next = itr;
                temp = itr;
            }
            itr = itr.next;
        }
        temp.next = null;
        return nhead.next;
    }
    
    public static ListNode findCycleNode(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (fast != head) {
                    head = head.next;
                    fast = fast.next;
                }
                return head;
            }
        }
        return null;
    }
}
