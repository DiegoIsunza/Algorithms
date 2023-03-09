package ALGORITHMS.SEARCHING;

public class BinarySearchRecursive {

    public int binarySearch(int[]arr, int l, int r, int key) {
        int n = arr.length;

        if(l <= r) {
            int mid = (l + r) /2;

            // base case
            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] > key)
                return binarySearch(arr, l, mid-1, key);

            return binarySearch(arr, mid+1, r, key);

        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchRecursive bs = new BinarySearchRecursive();

        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(bs.binarySearch(arr,0, 4, 2));
    }
}
