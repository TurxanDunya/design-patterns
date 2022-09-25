package gangoffour.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Constructor called only once for EagerSingleton");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

}