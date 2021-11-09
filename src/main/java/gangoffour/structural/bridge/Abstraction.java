package gangoffour.structural.bridge;

/**
 * This is the abstraction
 */
public class Abstraction {

    Bridge bridge;

    public Abstraction(Bridge implementation) {
        bridge = implementation;
    }

    public String operation() {
        return "Abstraction <> " + bridge.operationImpl();
    }

}