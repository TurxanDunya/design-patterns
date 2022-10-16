package gangoffour.behavioral.strategy.strategies;

import gangoffour.behavioral.strategy.Sortable;

public class QuickSort implements Sortable {

    @Override
    public String sort(int[] numbers) {
        return "Sorted with Quick sort";
    }

}
