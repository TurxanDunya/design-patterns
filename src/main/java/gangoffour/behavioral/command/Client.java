package gangoffour.behavioral.command;

import gangoffour.behavioral.command.commands.LightOffCommand;
import gangoffour.behavioral.command.commands.LightOnCommand;

/**
 * Do not confuse on focusing object creations. It is just for simulation.
 * Focus on that, we can press remote.pressButton() to turn on and turn off the light.
 */
public class Client {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        // We can change command dynamically
        // UNDO - on
        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        // REDO - off
        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();
    }
}