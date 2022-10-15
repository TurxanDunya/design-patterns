package gangoffour.behavioral.strategy.strategies;

import gangoffour.behavioral.strategy.Sortable;

public class BubbleSort implements Sortable {

    @Override
    public String sort(int[] numbers) {
        return "Sorted with Bubble sort";
    }

}
