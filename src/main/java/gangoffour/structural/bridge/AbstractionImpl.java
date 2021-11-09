package gangoffour.structural.bridge;

/**
 * A refined abstraction
 */
public class AbstractionImpl extends Abstraction {

    public AbstractionImpl(Bridge implementation) {
        super(implementation);
    }

    @Override
    public String operation() {
        return "New functionalities for operation";
    }

}