package gangoffour.behavioral.command;

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