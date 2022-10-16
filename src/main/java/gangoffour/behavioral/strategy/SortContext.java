package gangoffour.behavioral.strategy;

import gangoffour.behavioral.strategy.strategies.BubbleSort;
import gangoffour.behavioral.strategy.strategies.JavaSort;
import gangoffour.behavioral.strategy.strategies.QuickSort;

public class SortContext {

    private final Sortable bubbleSort = new BubbleSort();
    private final Sortable quickSort = new QuickSort();
    private final Sortable javaSort = new JavaSort();

    /**
     * Also abstract factory can be applied here
     */
    public String sort(int[] numbers) {
        if (numbers.length < 100) {
            return bubbleSort.sort(numbers);
        }

        if (numbers.length < 1_000_000) {
            return quickSort.sort(numbers);
        }

        return javaSort.sort(numbers);
    }

}
