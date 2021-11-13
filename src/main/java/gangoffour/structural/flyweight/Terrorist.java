package gangoffour.structural.flyweight;

// Terrorist must have weapon and mission
public class Terrorist implements Player {

    // Intrinsic Attribute, constant data set
    private final String TASK;

    // Extrinsic Attribute, data set from the outside
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    public void assignWeapon(String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    public void mission() {
        // Work on the Mission
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }

}