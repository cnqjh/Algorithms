package Queues;

public class CircularQueue {
    public static void main(String[] args) {
        int max=20;
        CircularQueueArrary circularQueueArrary= new CircularQueueArrary(max);
        if(circularQueueArrary.IsFull()){
            System.out.println("队满");
        }else {
            circularQueueArrary.Insert(1);
            circularQueueArrary.Insert(2);
            circularQueueArrary.Insert(3);
            circularQueueArrary.Insert(4);
            circularQueueArrary.Insert(5);
            circularQueueArrary.Insert(6);
            circularQueueArrary.Insert(7);
        }
        while(!circularQueueArrary.IsEmpty()){
            long n=circularQueueArrary.delete();
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }
    public static class CircularQueueArrary{
        private int maxSize;
        private long ArraryQue[];
        private int n;
        private int front;
        private int rear;

        public CircularQueueArrary(int max){
            maxSize = max;
            ArraryQue = new long[maxSize];
            front = 0;
            rear = -1;
            n = 0;
        }

        public void Insert(int value){
            if(rear==maxSize-1){
                rear=-1;
            }
            ArraryQue[++rear]=value;
            n++;
        }

        public long peekFront(){
            return ArraryQue[front];
        }

        public long delete(){
            long temp=ArraryQue[front++];
            if(front==maxSize-1){
                front=0;
            }
            n--;
            return temp;
        }
        public boolean IsEmpty(){
            return n==0;
        }

        public boolean IsFull(){
            return n==maxSize;
        }

        public int Size(){
            return n;
        }
    }
}
