public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int low = 0; 
        int high = arr.length-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target) {
                return mid;
            } else if( arr[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1 ;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 7, 9};
        int target = 1;
        int res = binarySearch(arr, target);
        System.out.println("Element found at index " + res);
    }
}
