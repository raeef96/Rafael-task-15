/**
 * A quicksort algorithm using a fixed pivot
 *
 * @author Raeef Bechara
 * @version 2021-03-04
 */
import java.util.Arrays;
public class QuicksortFixedPiv implements IntSorter {
    private int input[];
    private int length;

    @Override
    public void sort(int[] v) {
        if (v == null || v.length == 0) {
            return;
        }
        this.input = v;
        length = v.length;
        quickSort(0, length - 1);
    }

    /* * This method implements in-place quicksort algorithm recursively.
     *  */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        // pivot is middle index
        int pivot = input[low + (high - low) / 2];
        // Divide into two arrays
        while (i <= j) {

        }
        while (input[i] < pivot) {
            i++;
        }
        while (input[j] > pivot) {
            j--;
        }
        if (i <= j) {
            swap(i, j); // move index to next position on both sides i++; j--; } }
            i++;
            j--;

        }

        // calls quickSort() method recursively
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {
        // unsorted integer array
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));
        QuickSortFixedPiv algorithm = new QuickSortFixedPiv();
        algorithm.sort(unsorted);

        // sorting integer array using quicksort algorithm

        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
    }
}
