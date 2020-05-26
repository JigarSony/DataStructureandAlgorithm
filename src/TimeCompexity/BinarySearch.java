package TimeCompexity;

public class BinarySearch {

    //Big O
    /*
    BestCase: O(1)
    Worst-Average Case: O(logk N)
     */

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        //it's works only on sorted array
        int n = arr.length;
        int x = 9;

        int result = binarySearch(arr,x,0,n-1);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at: "+ result);
        }
    }

    public static int binarySearch(int[] arr, int x, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
