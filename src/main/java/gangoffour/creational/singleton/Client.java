package gangoffour.creational.singleton;

/**
 * A singleton class has only one instance, accessible globally through a single point.
 * Main problem this pattern solves is to ensure that only a single instance of this class exists.
 * Any state you add in your singleton becomes part of "global state" of your application.
 *
 * 1. For this, class constructors must be not be accessible globally.
 * 2. Subclassing/inheritance must not be allowed.
 *
 * EAGER SINGLETON - Create singleton as soon as class is loaded.
 * LAZY SINGLETON - Singleton is created when it is first required.
 * LAZY INITIALIZATION HOLDER = Creates an inner class, which holds initialization.
 */
public class Client {
    public static void main(String[] args) {
        // EAGER SINGLETON
        EagerSingleton eagerInstanceOne = EagerSingleton.getInstance();
        EagerSingleton eagerInstanceTwo = EagerSingleton.getInstance();
        System.out.println(eagerInstanceOne == eagerInstanceTwo);

        // LAZY SINGLETON
        LazySingleton lazyInstanceOne = LazySingleton.getInstance();
        LazySingleton lazyInstanceTwo = LazySingleton.getInstance();
        System.out.println(lazyInstanceOne == lazyInstanceTwo);

        // LAZY INITIALIZATION HOLDER
        LazyInitializationHolder lazyInitializationHolderInstanceOne = LazyInitializationHolder.getInstance();
        LazyInitializationHolder lazyInitializationHolderInstanceTwo = LazyInitializationHolder.getInstance();
        System.out.println(lazyInitializationHolderInstanceOne == lazyInitializationHolderInstanceTwo);

        // SINGLETON ENUM
        SingletonEnum singletonEnumOne = SingletonEnum.INSTANCE;
        System.out.println(singletonEnumOne.getValue());
        singletonEnumOne.setValue(2);
        SingletonEnum singletonEnumTwo = SingletonEnum.INSTANCE;
        System.out.println(singletonEnumTwo.getValue());
    }
}
