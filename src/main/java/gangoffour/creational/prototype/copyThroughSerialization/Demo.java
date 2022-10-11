package gangoffour.creational.prototype.copyThroughSerialization;

import org.apache.commons.lang3.SerializationUtils;

/**
 * when our fields is much more, then this mechanism is more powerful
 */
public class Demo {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");

        byte[] serialize = SerializationUtils.serialize(foo);
        Foo cloneFoo = (Foo) SerializationUtils.deserialize(serialize);
        cloneFoo.whatever = "xyz";

        System.out.println(foo);
        System.out.println(cloneFoo);
    }
}