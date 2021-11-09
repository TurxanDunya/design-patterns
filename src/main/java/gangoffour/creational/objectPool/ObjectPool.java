package gangoffour.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * We just creating a collection. And getting or returning object to this collection.
 */
public class ObjectPool<T extends Poolable> {

    // Creates in memory cache
    private BlockingQueue<T> availablePool;

    // Supplier - is a functional interface and it has only one method called 'get()'. Get object of Bitmap
    // Count - how many objects must be created in pool
    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    // Client can ask for object from pool
    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException ex) {
            //or you can create new object
            System.err.println("take() was interrupted");
        }
        return null;
    }

    // Client returns object to pool
    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException ex) {
            System.err.println("put() was interrupted");
        }
    }

}
