package gangoffour.creational.prototype.shallowcopy;

public abstract class GameUnit implements Cloneable {

    // Not that String is immutable. So, we will do shallow copy (on the contrary: deep copy)
    private String name;

    public GameUnit() {
        this.name = "Prototype";
    }

    /**
     * This is "shallow copy". So, it means, as String class is immutable, we only clone its fields
     * with reassigning.
     * must @return GameUnit itself.
     * must @throws CloneNotSupportedException if Cloneable interface was not implemented.
     */
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone(); // super.clone() performs a shallow copy
        unit.initialize(); // So, this unit reference is now carries copy of this.object
        return unit;
    }

    /**
     * Purpose of initialize() method is reset object state.
     */
    protected void initialize() {
        this.name = "Prototype";
        reset();
    }

    /**
     * Providing reset method for also subclasses.
     */
    protected abstract void reset();

}
