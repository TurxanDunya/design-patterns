package gangoffour.behavioral.strategy.strategies;

import gangoffour.behavioral.strategy.Sortable;

public class JavaSort implements Sortable {

    @Override
    public String sort(int[] numbers) {
        return "Sorted with Java sort";
    }

}
