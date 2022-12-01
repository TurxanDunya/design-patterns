package gangoffour.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento can also be an inner class in Originator
 */
public class Memento {

    private Originator originator;
    private final List<String> states;
    private int position = 0;

    public Memento() {
        states = new ArrayList<>();
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }

    public synchronized void save() {
        String state = originator.getState();
        System.out.println("Memento: Saving state: " + state);
        states.add(state);
        position++;
    }

    public synchronized void undo() {
        int currentPosition = position;
        currentPosition -= 2;
        String previousState = states.get(currentPosition);
        originator.setState(previousState);
        System.err.println("Memento: Undoing to: " + previousState);
    }

}
