package Array;
public class BinarySearch {

    public static boolean contains(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  

            if (arr[mid] == k) {
                return true;  
            } else if (arr[mid] < k) {
                left = mid + 1;  
            } else {
                right = mid - 1;  
            }
        }

        return false;  
    }

  
}