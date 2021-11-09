package gangoffour.creational.objectPool;

/**
 * WHEN USE IT? ANSWER: If cost of creating an instance of a class is high and
 * we need a large number of objects of this class for short duration, then we can use an object pool.
 * JDBC Pool and Thread Pool also use this pattern.
 *
 * Difference from Prototype Pattern is that, while:
 * Object Pool - has cached objects,
 * Prototype - creates object when needed and no caching is done.
 */
public class Client {

    // We said, create 5 instance of Bitmap in pool
    public static final ObjectPool<Bitmap> bitmapPool =
            new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation("ExampleLocationOne");
        Bitmap b2 = bitmapPool.get();
        b2.setLocation("ExampleLocationTwo");

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }

}