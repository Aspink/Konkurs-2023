import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SorterTester {
    private static final List<int[]> testSets = new ArrayList<>();

    public static void main(String[] args) {
        testSets.add(randomTab(10));
        testSets.add(randomTab(100));
        testSets.add(randomTab(1000));

        for (int[] testSet : testSets) {
            testSorter(testSet);
        }
    }

    private static void testSorter(int[] testSet) {
        System.out.print("Tablica nieposortowana: ");
        printTable(testSet);
        int[] sorted = Sorter.bubbleSorting(testSet);
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

    public static int[] randomTab(int size) {
        final Random random = new Random();
        int[] tab = new int[size];
        for(int i = 0; i < size; i++) {
            tab[i] = random.nextInt(size);
        }
        return tab;
    }
}