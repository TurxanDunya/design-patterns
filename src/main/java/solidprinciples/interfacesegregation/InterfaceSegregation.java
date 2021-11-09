package solidprinciples.interfacesegregation;

/**
 * Clients should not be forced to depend upon interface that they do not use.
 * In the opposite, it is called Interface Pollution.
 * We should avoid LARGE INTERFACES, UNRELATED METHODS.
 * <p>
 * Think that it is like Single Responsibility. But, difference is that while
 * Single Responsibility responsible for classes,
 * Interface Segregation responsible for interfaces.
 */
class InterfaceSegregation {

    /**
     * For example, birds can not bark.
     */

    interface Animal {
        void fly();
        void run();
        void bark();
    }

    public class Bird implements Animal {
        public void bark() {
            // What? Can birds bark?
        }
        public void run() {
            System.out.println("Koşan kuş");
        }
        public void fly() {
            System.out.println("Uçan kuş");
        }
    }

}
