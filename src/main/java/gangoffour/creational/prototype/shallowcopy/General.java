package gangoffour.creational.prototype.shallowcopy;

/**
 * We do not want to clone General class object.
 * So, we will override clone() method again.
 */
public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General {" + "state= " + state + '}';
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

}
