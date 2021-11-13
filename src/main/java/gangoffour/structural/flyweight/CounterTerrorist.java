package gangoffour.structural.flyweight;

// CounterTerrorist must have weapon and mission
public class CounterTerrorist implements Player {

    // Intrinsic Attribute, constant data set
    private final String TASK;

    // Extrinsic Attribute, data set from the outside
    private String weapon;

    public CounterTerrorist() {
        TASK = "DIFFUSE BOMB";
    }

    public void assignWeapon(String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    public void mission() {
        // Work on the Mission
        System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }

}