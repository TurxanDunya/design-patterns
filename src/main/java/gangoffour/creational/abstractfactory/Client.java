package gangoffour.creational.abstractfactory;

import gangoffour.creational.abstractfactory.factories.AwsResourceFactory;
import gangoffour.creational.abstractfactory.factories.GoogleResourceFactory;
import gangoffour.creational.abstractfactory.factories.ResourceFactory;
import gangoffour.creational.abstractfactory.instance.Instance;
import gangoffour.creational.abstractfactory.storage.Storage;

/**
 * ABSTRACT FACTORY is used, when we have two or more objects which work together forming a
 * kit or set and there can be multiple sets or kits that can be created by client code.
 * In other words, we create families. Because of this, this pattern also called as "factory of factories".
 *
 * Keep in mind, we have to provide the client code with concrete factory, so that it can create objects.
 *
 * While Factory Method just hides the concrete objects which are used from the client code,
 * Abstract Factory - hides factories as well as concrete objects used from the client code.
 */
public class Client {

    private final ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMb) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMb);
        instance.attachStorage(storage); // we just add storage to instances. Do not confuse :)
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance awsInstance = aws.createServer(Instance.Capacity.micro, 2048);
        awsInstance.start();
        awsInstance.stop();

        System.out.println("************************************");

        Client google = new Client(new GoogleResourceFactory());
        Instance googleInstance = google.createServer(Instance.Capacity.large, 20480);
        googleInstance.start();
        googleInstance.stop();
    }
}
