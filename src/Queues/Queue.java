package Queues;

public class Queue {
    public static void main(String[] args) {
        int max=10;
        QueueArrary queueArrary=new QueueArrary(max);
        queueArrary.Pop();
        queueArrary.Push(1);
        queueArrary.Push(2);
        queueArrary.Push(3);
        queueArrary.Push(4);
        queueArrary.Push(5);
        queueArrary.Push(6);
        queueArrary.Push(7);
        queueArrary.Push(8);
        queueArrary.Push(9);
        queueArrary.Display();

    }

    public static class QueueArrary {
        private int maxSize;
        private long ArraryQue[];
        private int n;
        private int front;
        private int rear;

        public QueueArrary(int max) {
            maxSize = max;
            ArraryQue = new long[maxSize];
            front = 0;
            rear = -1;
            n = 0;
        }
//          入隊
        public void Push(int value) {
            if (IsFull()) {
                System.out.println("Error：隊列已滿");
            } else {
                ArraryQue[++rear] = value;
                n++;
            }
        }
//        出隊
        public  void  Pop() {
            if (IsEmpty()) {
                System.out.println("Error：隊列為空");
            } else {
                ArraryQue[front++] = 0;
            }
        }

        private boolean IsFull(){
            return (rear==maxSize-1);
        }

        private boolean IsEmpty(){
            return (front==0||front==maxSize-1);
        }

        public void Display(){
            for(int j=front;j<=rear;j++){
                System.out.print(ArraryQue[j]+" ");
            }
            System.out.println(" ");
        }

    }
}
