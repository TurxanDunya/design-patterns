package gangoffour.creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class.
 * This ensures that, we have a lazy initialization without worrying about synchronization.
 * We have used inner class
 */
public class LazyInitializationHolder {

    // As soon as class loaded, static INSTANCE variable will be initialized
    private static class InitializationHolder {
        static LazyInitializationHolder INSTANCE = new LazyInitializationHolder();
    }

    private LazyInitializationHolder() {
        System.out.println("Constructor called only once for LazyInitializationHolder");
    }

    public static LazyInitializationHolder getInstance() {
        return InitializationHolder.INSTANCE;
    }

}
