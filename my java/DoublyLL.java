public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        Node newNode  = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head =tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeF()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1)
        {
            head = tail = null;
            size--;
            return head.data;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    public int removeL(){
        if(size == 0)
        {
            System.out.println("ll is emoty");
            return Integer.MIN_VALUE;
        }
        if(size == 1)
        {
            int val = head.data ;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node temp = tail.prev;
        temp.next = null;
        size--;
        return val;
    }



    public void printll(){
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }


    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();
        
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);

        dll.removeF();
        dll.removeL();
        
        dll.printll();
        
    }
    
}
