package Search;

public class BinarySearch {
    // Iterative binary search method
    public static int BinarySearch(int [] arr, int target){
        int left =0;
        int right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left)/2;

            // check if target is present at mid
            if(arr[mid] == target)
                return mid;

            // If target is greater, ignore left hand
            if(arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right hand
            else
                right = mid - 1;
        }
        // target not found
        return -1;
    }
}
