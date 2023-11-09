
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 45, 56, 67, 78 };
        System.out.println(binarysearch(arr, 6, 56));
    }

    public static int binarysearch(int arr[], int n, int k) {
        // code here
        // here n is the length of the array
        // here k is the target element
        int start = 0;
        int end = n;
        int target = k;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
