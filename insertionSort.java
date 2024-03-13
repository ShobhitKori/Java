import java.util.Random;
public class insertionSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void main(String args[]){
        Random rand = new Random();
        int numbers[] = new int[10];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = rand.nextInt(100);

        System.out.println("Before: ");
        printArr(numbers);

        InsertionSort(numbers);
        System.out.println("\nAfter: ");
        printArr(numbers);
    }
}
