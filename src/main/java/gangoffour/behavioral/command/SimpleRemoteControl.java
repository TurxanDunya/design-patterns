package gangoffour.behavioral.command;

/**
 * A Simple remote control with one button.
 * We simply put the light control inside of remote control.
 *
 * Notice that the remote control doesn’t know anything about turning on or off the light.
 * That information is contained in a separate command object. This reduces the coupling between them.
 */
public class SimpleRemoteControl {

    // Only one button
    Command slot;

    public void setCommand(Command command) {
        // Set the command the remote will execute
        slot = command;
    }

    public void pressButton() {
        slot.execute();
    }

}