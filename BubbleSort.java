package Sorting;


public class BubbleSort {

    void BubbleSort(int arr[]) {
        int n = arr.length;
        // We need to check arr[j] and arr[j+1] we will do it with to loops
            for (int i = 0; i < n - 1; i++) // -1 since we will only do n-1 comparisons
                for (int j = 0; j < n - i - 1; j++) // n-i because higher #s already sorted, no need to traverse again
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
    }

    void  printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = new int[] {5,2,7,3,10};

        bs.printArray(arr);
        bs.BubbleSort(arr);
        bs.printArray(arr);

    }
}
