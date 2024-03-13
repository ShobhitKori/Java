public class recursion3 {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1)     //sorted
            return true;
        if(arr[idx] >= arr[idx+1])  //unsorted
            return false;
        return isSorted(arr, idx+1);
    }
    public static void main(String args[]){
        //time complexity = O(n)
        int arr[] = {1,3,5,6,6};
        System.out.println(isSorted(arr, 0));
    }
}
