package gangoffour.behavioral.memento;

public class Client {

    private static Originator originator;
    private static Memento memento;

    public static void main(String[] args) {
        originator = new Originator("state-0");
        memento = originator.getMemento();

        OriginatorTrigger trigger = new OriginatorTrigger();
        trigger.start();

        // We have to pass memento to Caretaker, so Caretaker may say what to do to memento
        Caretaker caretaker = new Caretaker(memento);
        caretaker.start();
    }

    static class OriginatorTrigger extends Thread {
        public void run() {
            for (int i = 1; i < 20; i++) {
                String state = "state-" + i;
                originator.setState(state);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}
