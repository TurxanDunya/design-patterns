package gangoffour.behavioral.memento;

public class Caretaker extends Thread {

    private final Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i != 0 && i % 5 == 0) {
                memento.undo();
            }

            memento.save();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
