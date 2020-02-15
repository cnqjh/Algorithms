package Sort;

/**
 * @Author Mu_hui
 * @Date 2020-2-15 21:33:26
 * @Name 冒泡排序
 */
public class BubbleSort {
   public static class ArraryBub{
        private long a[];
        private int n;
        public ArraryBub(int max){
            a=new long[max];
            n=0;
       }
//      添加数据
        public void insert(long value){
            a[n]=value;
            n++;
        }
//        删除数据
       public void delete(int one){
                if(check(one)==-1){
                    System.out.println("（删除）该数据不存在");
                }
               else{
                   for(int j=check(one);j<n-1;j++){
                    a[j]=a[j+1];
                }
                n--;}
       }

//          查找数据
       public int check(int one){
            for (int j=0;j<n;j++){
                if(a[j]==one){
                    return j;
                }
            }
            return -1;
       }
//       改数据
       public void modify(int one,int two){
            if (check(one)==-1){
                System.out.println("（修改）该数据不存在");
            }
            else {
                a[check(one)]=two;
            }
       }
//       展示当前已经储存的数据
       public void CurrentDisplay(){
           for (long arr:a
                ) {
               System.out.print(arr+" ");
           }
//            for (int j=0;j<n;j++){
//                System.out.print(a[j]+" ");
//            }
           System.out.println(" ");
       }
//       从小到大展示数据
       public void MaxDisplay(){
            MaxBubbleSort();
           for (int j=0;j<n;j++){
               System.out.print(a[j]+" ");
           }
           System.out.println(" ");
       }
//       从大到小展示数据
       public void MinDisplay(){
           MinBubbleSort();
           for (int j=0;j<n;j++){
               System.out.print(a[j]+" ");
           }
           System.out.println(" ");
       }
//            冒泡排序从大到小
       private void MinBubbleSort(){
           for (int outer=n-1;outer>1;outer--){
               for(int inner=0;inner<outer;inner++){
                   if (a[inner] < a[inner+1]) {
                       MinSwap(inner,inner+1);
                   }
               }
           }
       }
       private void MinSwap(int one,int two){
           long temp=a[one];
           a[one]=a[two];
           a[two]=temp;
       }
//       冒泡排序从小到大
       private void MaxBubbleSort(){
            for (int outer=n-1;outer>1;outer--){
                for(int inner=0;inner<outer;inner++){
                    if (a[inner] > a[inner+1]) {
                        MaxSwap(inner,inner+1);
                    }
                }
            }
       }
       private void MaxSwap(int one,int two){
            long temp=a[one];
            a[one]=a[two];
            a[two]=temp;
       }

    }
    public static void main(String[] args) {
        int max=11;
        ArraryBub arraryBub=new ArraryBub(max);
        arraryBub.insert(33);
        arraryBub.insert(902);
        arraryBub.insert(656);
        arraryBub.insert(5867);
        arraryBub.insert(1777);
        arraryBub.insert(3);
        arraryBub.insert(81);
        arraryBub.insert(787);
        arraryBub.insert(452);
        arraryBub.insert(25);
        arraryBub.insert(63);

        arraryBub.CurrentDisplay();
        arraryBub.MaxDisplay();
        arraryBub.delete(6);
        arraryBub.modify(6,665);
        arraryBub.MinDisplay();
    }

}

