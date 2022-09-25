package gangoffour.creational.singleton;

public class LazySingleton {

    // Volatile says to JVM, do not use cached version of INSTANCE
    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("Constructor called only once for LazySingleton");
    }

    /**
     * If two client request for INSTANCE, then maybe class instance will be created two times.
     * So, we use synchronized block here. But, it can cause to caching of INSTANCE variable in CPU.
     */
    public static LazySingleton getInstance() {
        /*
         * We use double "null" check because of performance issue.
         * So, we just need "synchronized" part only first few threads, not for all of them.
         * This pattern called "double check locking".
         */
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
    }

}