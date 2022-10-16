package gangoffour.behavioral.strategy;

public class Client {
    /**
     * So, client does not know anything about sorting strategy.
     */
    public static void main(String[] args) {
        var sortContext = new SortContext();
        String sorted = sortContext.sort(new int[] {23, 56, 23, 65});
        System.out.println(sorted);
    }
}
