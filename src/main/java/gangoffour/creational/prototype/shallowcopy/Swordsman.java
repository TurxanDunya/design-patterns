package gangoffour.creational.prototype.shallowcopy;

public class Swordsman extends GameUnit {

    private String state = "idle";

    /**
     * if this method called, it will change state
     * and for reset the state, state() method will be called
     */
    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman {" + " state= " + state + '}';
    }

    @Override
    protected void reset() {
        state = "idle";
    }

}
