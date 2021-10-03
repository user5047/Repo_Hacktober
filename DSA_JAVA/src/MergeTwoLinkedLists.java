class LinkedList{
	int data;
	LinkedList next;
	LinkedList(int data){
		this.data = data;
		this.next = null;
	}
}
public class mergeTwoLists {
	public static void display(LinkedList head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	public static LinkedList merge(LinkedList l1, LinkedList l2) {
		LinkedList head = null;
		LinkedList temp = null;
		while(l1!=null && l2!=null) {
			if(l1.data < l2.data) {
				if(head==null) {
					head = l1;
					temp = head;
					l1 = l1.next;
				}else {
					temp.next = l1;
					temp = temp.next;
					l1 = l1.next;
				}
			}else {
				if(head==null) {
					head = l2;
					temp = head;
					l2 = l2.next;
				}else {
					temp.next = l2;
					temp = temp.next;
					l2 = l2.next;
				}
			}
		}
		if(l1!=null) {
			temp.next = l1;
		}
		if(l2!=null) {
			temp.next = l2;
		}
		return head;
	}
	public static void main(String[] args) {
		//Assuming the input lists will be sorted.
		//Eg for two lists L1: 1->3->5->7 and L2: 2->4->6->8

		//Creating l1
		LinkedList l1 = new LinkedList(1);
		LinkedList temp = l1;
		LinkedList newEle = new LinkedList(3);
		temp.next = newEle;
		temp = temp.next;
		newEle = new LinkedList(5);
		temp.next = newEle;
		temp = temp.next;
		newEle = new LinkedList(7);
		temp.next = newEle;
		temp = temp.next;
		
		//Creating l2
		LinkedList l2 = new LinkedList(2);
		temp = l2;
		newEle = new LinkedList(4);
		temp.next = newEle;
		temp = temp.next;
		newEle = new LinkedList(6);
		temp.next = newEle;
		temp = temp.next;
		newEle = new LinkedList(8);
		temp.next = newEle;
		temp = temp.next;
		
		//Displaying the formed lists: 
		display(l1);
		display(l2);
		
		LinkedList l = merge(l1, l2);
		
		//Display merged list
		display(l);
	}
}
