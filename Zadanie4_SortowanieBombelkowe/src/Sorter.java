import java.util.Arrays;

public class Sorter {
    public static int[] bubbleSorting(int[] unsorted) {
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        int unsortedSize = sorted.length - 1;
        boolean sorting = true;
        int temp;
        while(sorting) {
            sorting = false;
            for(int i = 0; i < unsortedSize; i++) {
                if(sorted[i] > sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    sorting = true;
                }
            }
            unsortedSize--;
        }
        return sorted;
    }
}
