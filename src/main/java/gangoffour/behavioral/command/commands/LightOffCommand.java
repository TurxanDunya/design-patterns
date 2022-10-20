package gangoffour.behavioral.command.commands;

import gangoffour.behavioral.command.Light;

/**
 * A concrete implementation of command.
 */
public class LightOffCommand implements Command {

    private final Light light;

    // The constructor is passed the light. It is going to control.
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

}