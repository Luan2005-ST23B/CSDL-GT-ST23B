package Sort;

public class InsertionSort {
    public static void InsertionSort(int arr[], boolean ascending){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i - 1;

            // Di chuyen cac phan tu cua arr[0...i-1] lon hon key ve phia sau
            // cho den khi tim duoc vi tri dung cho key
            while (j >=0 &&(ascending ? arr[j] > temp: arr[j] < temp)){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
