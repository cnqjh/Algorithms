package Stacks;

/**
 * @Author Mu_Hui
 * @Date 2020-2-17 19:39:40
 * @Name 栈
 */
public class Stack {
    public static void main(String[] args) {
        int max=10;
        StackA stackA=new StackA(max);
        stackA.Push(1);
        stackA.Push(2);
        stackA.Push(3);
        stackA.Push(4);
        stackA.Push(5);
        stackA.Push(6);


        if (stackA.IsFull()){
            System.out.println("满栈");
        }
        if (stackA.IsEmpty()){
            System.out.println("error：栈为空");
        }
        else {
            System.out.println("只显示栈顶："+stackA.Peek());
            System.out.print("栈内所有元素：");
            while (!stackA.IsEmpty()){
                System.out.print(stackA.Pop()+" ");

            }
            System.out.println(" ");
        }
    }
    public static class StackA{
        private int maxSize;
        private int top;
        private long stackArrary[];
        public  StackA(int max){
            maxSize=max;
            stackArrary=new long[maxSize];
            top=-1;
        }
//        入栈
        public void Push(long one){
            stackArrary[++top]=one;
        }
//        出栈
        public long Pop(){
            return stackArrary[top--];
        }
//        显示栈顶数据
        public long Peek(){
            return stackArrary[top];
        }
//        判断是否栈空
        public boolean IsEmpty(){
            return (top==-1);
        }
//        判断是否溢出
        public boolean IsFull(){
            return (top==maxSize-1);
        }
    }
}
