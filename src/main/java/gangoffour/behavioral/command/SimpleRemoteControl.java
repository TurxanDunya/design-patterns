package gangoffour.behavioral.command;

import gangoffour.behavioral.command.commands.Command;

/**
 * A Simple remote control with one button.
 * We simply put the light control inside remote control.
 *
 * Notice that the remote control does not know anything about turning on or off the light.
 * That information is contained in a separate command object. This reduces the coupling between them.
 */
public class SimpleRemoteControl {

    // Only one button
    private Command slot;

    public void setCommand(Command command) {
        // Set the command the remote will execute
        this.slot = command;
    }

    public void pressButton() {
        slot.execute();
    }

}