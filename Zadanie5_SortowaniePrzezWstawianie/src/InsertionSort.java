import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] unsorted) {
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        int temp, j, i;
        for(i = 1; i < sorted.length; i++) {
            temp = sorted[i];
            j = i - 1;
            while(j >= 0 && sorted[j] > temp) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = temp;
        }
        return sorted;
    }
}
