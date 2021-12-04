package gangoffour.behavioral.command;

/**
 * A concrete implementation of command.
 */
public class LightOnCommand implements Command {

    Light light;

    // The constructor is passed the light. It is going to control.
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

}