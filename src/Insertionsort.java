/**
 * An insertion sort algorithm
 *
 * @author Raeef Bechara
 * @version 2021-03-04
 */
public class Insertionsort implements IntSorter {

    @Override
    public void sort(int[] v) {
            int n = v.length;
            for (int i = 1; i < n; ++i) {
                int key = v[i];
                int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && v[j] > key) {
                    v[j + 1] = v[j];
                    j = j - 1;
                }
                v[j + 1] = key;
            }
        }

    }
