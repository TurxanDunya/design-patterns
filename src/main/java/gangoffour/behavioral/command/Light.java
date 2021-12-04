package gangoffour.behavioral.command;

/**
 * This class is the receiver.
 * Remember, in command object we need receiver, on which command will call operation.
 */
public class Light {

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }

}