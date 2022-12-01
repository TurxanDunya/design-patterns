package gangoffour.structural.flyweight.player;

/**
 *  CounterTerrorist must have weapon and mission, and it is flyweight object
  */
public class CounterTerrorist implements Player {

    // Intrinsic Attribute, constant data set
    private final String TASK;

    // Extrinsic Attribute, data set from the outside
    private String weapon;

    // A flyweight should initialize its intrinsic state just once, via constructor parameters.
    // It shouldn’t expose any setters or public fields to other objects.
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