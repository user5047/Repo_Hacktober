import java.util.*;

public class LinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	public static void merge(ListNode head1,ListNode head2)
	{
		ListNode temp1,temp2;
		temp1=head1;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp2=head2;
		temp1.next=temp2;
		while(temp2.next!=null)
		{
			temp1.data=temp2.data;
			temp1=temp1.next;
			temp2=temp2.next;
		}
	}
}
