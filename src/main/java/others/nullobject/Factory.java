package others.nullobject;

import others.nullobject.object.AbstractObject;
import others.nullobject.object.NullObject;
import others.nullobject.object.RealObject;

public class Factory {

    public static AbstractObject createObject(int objectType) {
        if (objectType == 1) {
            return new RealObject();
        }

        return new NullObject();
    }

}
