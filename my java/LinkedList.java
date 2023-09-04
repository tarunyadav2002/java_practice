public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

            //step 1 create a node
            Node newNode = new Node(data);
            size++;
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            //step 2 newnode next = head
            newNode.next = head;
            //step 3 head = newnode
            head = newNode;
        }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head== null)
        {
            head = tail= newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print()
    {
        if(head == null)
        {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int index,int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    } 

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size= 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;

        int i = 0;
        Node prev = head;
        for( i=0;i<size-2;i++)
        {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }
    public int itrSearch(int key)
    {
        Node temp = head;
        for(int i=0;i<size;i++)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head.data == key)
        {
            return 0;
        }
        if(head == null)
        {
            return -1;
        }
        int idx = helper(head.next,key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key)
    {
        return helper(head,key);
    }

    public void reverseLlist()
    {
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while(curr!=null)
        {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }

        head = prev ;

    }

    public void deleteNthfromLast(int n)
    {
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }
        if(sz == n)
        {
            head = head.next;
        }
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i<sz-n)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }

    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPallindrome()
    {
        if(head==null || head.next == null)
        {
            return true;
        }
        Node midnode = findmid(head);

        Node prev = null;
        Node curr = midnode;
        Node next;

        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle()
    {
        //step 1 detect cycle
        Node slow = head;
        Node fast= head;
        boolean check = false;
        while(fast.next!=null && fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                check = true;
                break;
            }
        }

        if(check == false)
        {
            return;
        }

        slow = head;
        Node prev = null;
        while(slow!=fast)
        {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;



    }


    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast !=null && fast.next !=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1,Node head2)
    {
        Node MergedLL = new Node(-1);
        Node temp = MergedLL;

        while(head1 !=null && head2 != null)
        {
            if(head1.data<=head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null)
        {
            temp.next = head2.next;
            head2 = head2.next;
            temp = temp.next;
        }

        return MergedLL.next;
        
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

    public void zigzag(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid  = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right  = prev;
        Node Rnext;
        Node Lnext;
        while(left != null && right != null)
        {
            Lnext = left.next;
            left.next = right;
            Rnext = right.next;
            right.next = Lnext;

            right = Rnext;
            left = Lnext;



        }

    }



    
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        
         //ll.addFirst(2);
        // ll.print();
         //ll.addFirst(1);
        // ll.print();
         //ll.addLast(4);
         //ll.print();
         //ll.addLast(5);

         //ll.print();

         //ll.add(2,3);

        //  ll.print();
        //  System.out.println(ll.size);

        //  ll.removeFirst();
        //  ll.print();
        //  System.out.println(ll.size);

        //  ll.removeLast();

        // ll.print();
         //System.out.println(ll.size);

         //System.out.println("the index of key is " +ll.recSearch(3));

         //ll.reverseLlist();
         //ll.print();

        // ll.deleteNthfromLast(3);
         //ll.print();

        //  ll.addLast(1);
        //  ll.addLast(2);
        //  ll.addLast(2);
        //  ll.addLast(2);

         

        //  System.out.println(ll.checkPallindrome()) ;
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // //ll.print();

        // ll.removeCycle();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.zigzag();
        
       // ll.head = ll.mergeSort(ll.head);
        ll.print();



         

        
    }
}

