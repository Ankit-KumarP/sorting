// (29/03/2024, 16:41)  
// QUES: IMPLEMENT SELECTION SORT
package sorting;

public class Q01selection {

    // LOGIC:
    // choose minimum element from unsorted part of array and swap it with the 1st
    // element of unsorted part.
    // T = O(n^2) | S = O(1)

    // selectionSort
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
        }
    }

    // swap
    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 0, 34, 8, 3, 9 };
        selectionSort(arr, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}