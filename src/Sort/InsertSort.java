package Sort;

/**
 * @Author Mu_Hui
 * @Date 2020-2-17 14:50:23
 * @Name 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int max = 100;
        ArraryIns arraryIns = new ArraryIns(max);
        arraryIns.insert(22);
        arraryIns.insert(232);
        arraryIns.insert(32);
        arraryIns.insert(42);
        arraryIns.insert(22);
        arraryIns.insert(242);
        arraryIns.insert(55);
        arraryIns.insert(62);
        arraryIns.insert(78);
        arraryIns.insert(92);
        arraryIns.Display();
        arraryIns.InsertDisplay();
    }

    public static class ArraryIns {
        private long a[];
        private int n;

        public ArraryIns(int max) {
            a = new long[max];
            n = 0;
        }

        public void insert(int value) {
            a[n] = value;
            n++;
        }

        private void insertSort() {
            int outer, inner;
            for (outer = 1; outer < n; outer++) {
                long temp = a[outer];
                inner = outer;
                while (inner > 0 && a[inner - 1] >= temp) {
                    a[inner] = a[inner - 1];
                    --inner;
                }
                a[inner] = temp;
            }
        }

        public void Display() {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println(" ");
        }

        public void InsertDisplay() {
            insertSort();
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println(" ");
        }
    }
}
