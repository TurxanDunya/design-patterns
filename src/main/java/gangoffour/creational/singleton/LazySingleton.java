package gangoffour.creational.singleton;

public class LazySingleton {

    private LazySingleton() {
        System.out.println("Constructor called only once for LazySingleton");
    }

    // Volatile says to JVM, do not use cached version of INSTANCE
    private static volatile LazySingleton INSTANCE;

    /**
     * If two client request for INSTANCE, then maybe class instance will be created two times.
     * So, we used synchronized block here. But, it can cause to caching of INSTANCE variable in CPU.
     */
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null)
                    INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
    }

}