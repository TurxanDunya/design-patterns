package gangoffour.creational.abstractfactory.instance;

import gangoffour.creational.abstractfactory.storage.Storage;

public interface Instance {
    // don't confuse on this
    enum Capacity {micro, small, large}

    void start();

    // even we add storage to instances
    void attachStorage(Storage storage);

    void stop();
}
