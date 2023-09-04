import java.util.LinkedList;
public class QueueUsingLL {

    public static class  Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{

        Node head = null;
        Node tail = null;

        public boolean isEmpty()
        {
            return head == null && tail == null;
        }

        public void add(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove()
        {
            if(isEmpty())
            {
                return -1;
            }
            int val = head.data;
            if(head == tail)
            {
                head = tail = null;
            }
            else{
            head = head.next;
            }
            return val;
        }

        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
        

    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        //q.add(4);
        //q.add(5);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();

        }
        
    }
    
}
