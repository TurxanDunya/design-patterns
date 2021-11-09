package gangoffour.creational.abstractfactory.factories;

import gangoffour.creational.abstractfactory.instance.Ec2Instance;
import gangoffour.creational.abstractfactory.instance.Instance;
import gangoffour.creational.abstractfactory.storage.S3Storage;
import gangoffour.creational.abstractfactory.storage.Storage;

// Factory implementation for AWS cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMb) {
        return new S3Storage(capMb);
    }
}
