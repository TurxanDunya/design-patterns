package gangoffour.creational.abstractfactory.factories;

import gangoffour.creational.abstractfactory.instance.GoogleComputeEngineInstance;
import gangoffour.creational.abstractfactory.instance.Instance;
import gangoffour.creational.abstractfactory.storage.GoogleCloudStorage;
import gangoffour.creational.abstractfactory.storage.Storage;

// Factory implementation for AWS cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMb) {
        return new GoogleCloudStorage(capMb);
    }
}
