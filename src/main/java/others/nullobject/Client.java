package others.nullobject;

import java.util.Random;
import others.nullobject.object.AbstractObject;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        AbstractObject object = Factory.createObject(random.nextInt(2));
        object.getNecessaryObject();
    }
}
