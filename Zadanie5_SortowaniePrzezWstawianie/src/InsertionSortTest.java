import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortTest {
    private static final List<int[]> testSets = new ArrayList<>();

    public static void main(String[] args) {
        testSets.add(new int[]{});
        testSets.add(new int[]{1,2,5,3,1,7,9,1,12,83,1,5,3,2});
        testSets.add(new int[]{1,1,1,1,1,1,1,2,1,1,1});
        testSets.add(new int[]{2,2,2,2});
        testSets.add(new int[]{1,2});
        testSets.add(new int[]{2,1});

        for (int[] testSet : testSets) {
            testSorter(testSet);
        }
    }

    private static void testSorter(int[] testSet) {
        System.out.print("Tablica nieposortowana: ");
        printTable(testSet);
        int[] sorted = InsertionSort.insertionSort(testSet);
        int[] comparisonSet = Arrays.stream(testSet)
                .sorted()
                .toArray();
        System.out.print("Tablica posortowana:    ");
        printTable(sorted);
        System.out.print("Tablica porównawcza:    ");
        printTable(comparisonSet);
        if(Arrays.equals(sorted, comparisonSet)) {
            System.out.println("\uD83D\uDC9A Test passed\n");
        }  else {
            System.out.println("\uD83D\uDC94 Test failed\n");
        }
    }

    public static void printTable(int[] table) {
        System.out.print("{");
        for(int number : table) {
            System.out.print(number + ", ");
        }
        if(table.length < 1) {
            System.out.print("  ");
        }
        System.out.println("\b\b}");
    }
}