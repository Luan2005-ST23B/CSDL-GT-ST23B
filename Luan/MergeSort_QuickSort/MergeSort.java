import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            //Tim diem chia mang
            int mid = (left + right)/2;

            //Sap xep mang con ben trai
            mergeSort(arr, left, mid);

            //Sap xep mang con ben phai
            mergeSort(arr, mid+1, right);

            //Hop nhat 2 mang da sap xep
            merge(arr, left, mid, right);
        }
    }

    //Ham hop nhat 2 mang da sap xep
    public static void merge(int[] arr,int left, int mid,int right){
        //kich thuoc 2 mang con can hop nhat
        int n1 = mid - left +1;
        int n2 = right - mid;

        //tao cac mang tam de luu du lieu
        int[] L = new int[n1];
        int[] R = new int[n2];

        //sao chep du lieu tu mang goc vao mang tam
        for(int i=0; i<n1; i++){
            L[i] = arr[left + i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[mid + 1 + j];
        }

        //hop nhat cac mang tam vao mang goc
        int i=0, j=0;
        int k = left;
        while (i<n1 && j<n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // sao chep cac ptu con lai cua mang L vao mang goc (neu co)
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        // sao chep cac ptu con lai cua mang R vao mang goc (neu co)
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Gọi hàm mergeSort để sắp xếp mảng
        mergeSort(arr, 0, n - 1);

        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}