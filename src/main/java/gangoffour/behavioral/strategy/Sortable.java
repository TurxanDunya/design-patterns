package gangoffour.behavioral.strategy;

/**
 * Separate class for every algorithm implementation.
 * It means minimum dependency among the sorting algorithm implementations.
 */
public interface Sortable {

    String sort(int[] numbers);

}
