package Sort;

public class SelectionSort {
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // hoan doi phan tu nho nhat tim duoc voi phan tu dau tien cua doan chua sap xep
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
