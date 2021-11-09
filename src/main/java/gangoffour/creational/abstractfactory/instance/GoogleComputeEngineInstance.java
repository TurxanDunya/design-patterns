package gangoffour.creational.abstractfactory.instance;

import gangoffour.creational.abstractfactory.storage.Storage;

// Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created GoogleComputeEngineInstance");
    }

    @Override
    public void start() {
        System.out.println("GoogleComputeEngineInstance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached" + storage + "to GoogleComputeEngineInstance");
    }

    @Override
    public void stop() {
        System.out.println("GoogleComputeEngineInstance stopped");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
}
