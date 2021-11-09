package gangoffour.creational.abstractfactory.factories;

import gangoffour.creational.abstractfactory.instance.Instance;
import gangoffour.creational.abstractfactory.storage.Storage;

// Abstract factory with methods defined for each object type
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMb);

}
