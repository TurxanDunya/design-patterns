package gangoffour.behavioral.mediator;

public class Junction {

    private final String name;
    private boolean busy;

    public Junction(String name) {
        this.name = name;
        busy = false;
        System.out.println("Junction " + name + " has created");
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public String getName() {
        return name;
    }

}
