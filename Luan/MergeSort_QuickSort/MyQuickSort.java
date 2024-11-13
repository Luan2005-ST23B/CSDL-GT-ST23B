import java.util.Arrays;

public class MyQuickSort {
    static void quickSort(int[] a, int L, int R){
        //dieu kien dung
        if(L >= R) return;

        // b1. chon khoa key
        int key = a[(L + R)/2];

        // b2. phan bo lai mang theo khoa key
        int k = partition(a, L, R, key); // k la pivot

        //b3. chia doi mang ===> lap lai
        quickSort(a, L,k-1);
        quickSort(a, k, R);
    }

    //return pivot value
    static int partition(int[] a, int L, int R, int key){
        int iL = L;
        int iR = R;
        while (iL <= iR){
            //voi iL, tim ptu  >= key de doi cho
            while (a[iL] < key) iL++;
            //voi iR, tim ptu  <= key de doi cho
            while (a[iR] > key) iR--;
            //doi cho 2 ptu dang dung ko dung vi tri
            if(iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}