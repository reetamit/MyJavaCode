
public class SinglyLinkedList {
    public LinkedNode head;

    public static class LinkedNode {
        private int data;
        private LinkedNode next;

    public LinkedNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public static LinkedNode ReverseLinkedList(LinkedNode head)
{
    if(head==null)
    {
        return null;
    } else {
        LinkedNode current = head;
        LinkedNode previous = null;
        LinkedNode nextNode = null;

        while(current!=null)
        {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }
}
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new LinkedNode(10);
        LinkedNode second = new LinkedNode(8);
        LinkedNode third = new LinkedNode(1);
        LinkedNode fourth = new LinkedNode(11);
        
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        LinkedNode current = sll.head;
        while(current!=null)
        {
            System.out.println("-->"+current.data);
            current=current.next;
        }
        
    LinkedNode rhead = ReverseLinkedList(sll.head);

    while(rhead!=null)
    {
        System.out.println("==>"+rhead.data);
        rhead = rhead.next;
    }
    }
}
