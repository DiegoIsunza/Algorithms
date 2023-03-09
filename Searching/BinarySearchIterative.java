package ALGORITHMS.SEARCHING;

public class BinarySearchIterative {

    public int binarySearch(Integer[] arr, Integer key) {
        int n = arr.length;
        int beg = 0;
        int end = n-1;

        while(beg <= end) {

            int middle = (beg + end) /2;

            if(key == arr[middle]) {
                System.out.print("Item is found on index ");
                return middle;
            }
            else if (key > arr[middle]) {
                beg = middle+1;
            }
            else{
                end = middle -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearchIterative bs =  new BinarySearchIterative();

        Integer[] arr = new Integer[] {1,2,3,4,5};
        System.out.println(bs.binarySearch(arr, 10));
    }
}
