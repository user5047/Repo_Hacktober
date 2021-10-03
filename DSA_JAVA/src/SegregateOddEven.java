class LinkedList{
	int data;
	LinkedList next;
	LinkedList(int data){
		this.data = data;
	}
}
public class SegregateOddEven {
	public static void oddEven(LinkedList head) {
		LinkedList odd = null;
		LinkedList even = null;
		LinkedList tempO = null;
		LinkedList tempE = null;
		while(head!=null) {
			if(head.data%2!=0) {
				if(odd==null) {
					odd = head;
					tempO = odd;
					head = head.next;
				}else {
					tempO.next = head;
					tempO = tempO.next;
					head = head.next;
				}
			}else {
				if(even==null) {
					even = head;
					tempE = even;
					head = head.next;
				}else {
					tempE.next = head;
					head = head.next;
					tempE = tempE.next;
				}
			}
		}
		tempO.next = null;
		tempE.next = null;
		display(odd);
		display(even);
	}
	public static void display(LinkedList head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
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
		newEle = new LinkedList(2);
		temp.next = newEle;
		temp = temp.next;
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
		oddEven(l1);
	}
}
