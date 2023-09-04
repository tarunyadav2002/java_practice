public class CircularQueue {

    public static class Queue {

        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n)
        {
             arr = new int[n];
             size = n;
             rear = -1;
             front = -1;
        }

        public static boolean isEmpty()
        {
            return front == -1 && rear == -1 ;
        }

        public static void add(int data)
        {
            if((rear+1)%size == front)
            {
                System.out.println("queue is full");
                return;
            }
            if(front == -1)
            {
                front = 0;
            }
            
            rear = (rear+1)%size;
            arr[rear] = data;
            
        }

        public static int remove()
        {
            if(isEmpty())
            {
                return -1;
            }

            int val = arr[front];

            

            if(front == rear)
            {
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            
            return val;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }

            return arr[front];
        }

    }


    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(2);
        q.add(3);
        q.add(4);
        q.add(4);
        q.add(5);

        q.add(6);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();

        }
    }

    
}


