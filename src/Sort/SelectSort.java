package Sort;

/**
 * @Author Mu_Hui
 * @Date 2020-2-16 13:40:41
 * @Name 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int max=11;
        ArrarySel arrarySel=new ArrarySel(max);
        arrarySel.Insert(33);
        arrarySel.Insert(902);
        arrarySel.Insert(656);
        arrarySel.Insert(5867);
        arrarySel.Insert(1777);
        arrarySel.Insert(3);
        arrarySel.Insert(81);
        arrarySel.Insert(787);
        arrarySel.Insert(452);
        arrarySel.Insert(25);
        arrarySel.Insert(63);

        arrarySel.Display();
        arrarySel.MaxDisplay();
        arrarySel.MinDisplay();
    }
    public static class ArrarySel{
        private long a[];
        private int n;
        public ArrarySel(int max){
             a=new long[max];
             n=0;
        }
//        添加
        public void Insert(int value){
            a[n]=value;
            n++;
        }
//        展示当前添加的
        public void Display(){
            for(int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println(" ");
        }
//        从小到大
        public void MaxDisplay(){
            MaxSelectoSort();
            for(int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println(" ");
        }
        private void MaxSelectoSort(){
            int max;
            for(int outer=0;outer<n-1;outer++){
                max=outer;
                for(int inner=outer+1;inner<n;inner++){
                    if (a[inner]<a[max]){
                        max=inner;
                    }
                }
                MaxSwap(outer,max);
            }
        }
        private void MaxSwap(int one,int two){
            long temp=a[one];
            a[one]=a[two];
            a[two]=temp;
        }
//        从大到小
        public void MinDisplay(){
            MinSelectoSort();
            for (int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println(" ");
        }
        private void MinSelectoSort(){
            int min;
            for(int outer=0;outer<n-1;outer++){
                min=outer;
                for(int inner=outer+1;inner<n;inner++){
                    if (a[inner]>a[min]){
                        min=inner;
                    }
                }
                MinSwap(outer,min);
            }
        }
        private void MinSwap(int one,int two){
            long temp=a[one];
            a[one]=a[two];
            a[two]=temp;
        }
    }
}
