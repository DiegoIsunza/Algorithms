package ALGORITHMS.SEARCHING;

import java.util.Scanner;

public class LinearSearch {

    public boolean linearSearch(Integer[] arr, Integer key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Element is found on position " + (i+1));
                return true;
            }
        }
        System.out.println("Element is not on the list");
        return false;
    }

    public void print(Integer[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();

        Integer[] arr = new Integer[]{21, 23, 56, 86, 99, 123};
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Insert the number you want to search in the list: ");
        number = sc.nextInt();
        ls.print(arr);
        ls.linearSearch(arr, number);
    }
}
