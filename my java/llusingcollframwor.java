import java.util.LinkedList;

import org.w3c.dom.Node;
public class llusingcollframwor {

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast.next !=null && fast!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);


    }
    
}
