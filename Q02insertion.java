// (29/03/2024, 18:05)
// QUES: IMPLEMENT INSERTION SORT
package sorting;

public class Q02insertion {
    // insertionSort
    static void insertionSort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 0, 34, 2, 3, 9 };
        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}