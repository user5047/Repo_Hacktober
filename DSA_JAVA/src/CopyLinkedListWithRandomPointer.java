/*
*
* Question: Clone a linked list with next and random pointer.
*      Input:   head = [[4,6],[5,4],[6,2],[1,2],[1,5]]
*      Output:         [[4,6],[5,4],[6,2],[1,2],[1,5]]
 */
public class CopyLinkedListWithRandomPointer
{
    static class Node
    {
        int value;
        Node next,random;

        Node (int key)
        {
            value=key;
            next=random=null;
        }
    }

    public void traverse(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println("value: "+temp.value+" && random: "+temp.random.value+"   ");
            temp=temp.next;
        }
    }

    public void cloneList(Node root)
    {
        if(root!=null) {
            Node curr = root, temp;
            while (curr != null) {
                temp = curr.next;
                //insert
                curr.next = new Node(curr.value);
                curr.next.next = temp;
                curr = temp; // skip the next, jumping to next to next
            }
            curr = root;
            while (curr != null) //adjusting random pointers
            {
                if (curr.next != null)
                    curr.next.random = (curr.random != null) ? curr.random.next : curr.random;

                curr = (curr.next != null) ? curr.next.next : curr.next;  //moving to the original one
            }
            Node original = root, copy = root.next;
            temp = copy;
            while (original != null && copy != null) {
                original.next = original.next != null ? original.next.next : original.next;
                copy.next = copy.next != null ? copy.next.next : copy.next;
                original = original.next;
                copy = copy.next;
            }
        /*
        printing the cloned list
         */
            traverse(temp);
        }
    }

    //main function
    public static void main(String[] args)
    {
        CopyLinkedListWithRandomPointer list=new CopyLinkedListWithRandomPointer();

        /*
        *initialise LL with dummy values
         */
        Node start = new Node(4);
        start.next = new Node(5);
        start.next.next = new Node(6);
        start.next.next.next = new Node(1);
        start.next.next.next.next = new Node(2);
        // 1st random points to 3rd
        start.random = start.next.next;

        // 2nd random points to 1st
        start.next.random = start;

         // 3rd and 4th random points to 5th
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random = start.next.next.next.next;

        // 5's random points to 2
        start.next.next.next.next.random = start.next;
        System.out.println("original list:: ");
        list.traverse(start);
        System.out.println("\ncopy list:: ");
        list.cloneList(start);
    }
}
