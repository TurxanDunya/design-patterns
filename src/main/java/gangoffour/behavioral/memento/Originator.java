package gangoffour.behavioral.memento;

public class Originator {

    // In this case, it is just a string. Of course, it can be any object
    private volatile String state;
    private final Memento memento = new Memento();

    public Originator(String state) {
        this.state = state;
        memento.setOriginator(this);
    }

    public String getState() {
        return state;
    }

    public synchronized void setState(String state) {
        System.out.println("\nNew state: " + state);
        this.state = state;
    }

    public Memento getMemento() {
        return memento;
    }

    @Override
    public String toString() {
        return "Originator{state= " + state + " }";
    }

}
