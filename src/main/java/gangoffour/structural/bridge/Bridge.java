package gangoffour.structural.bridge;

/**
 * This is the implementor. This is the bridge.
 * Note that it is also an interface.
 * As implementor is defining its own hierarchy which not related at all to the abstraction hierarchy.
 */
public interface Bridge {

    String operationImpl();

}