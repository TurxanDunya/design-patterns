package gangoffour.structural.proxy;

/**
 * This is our actual object.
 */
public class MinisterImpl implements Minister {

    public MinisterImpl() {
        System.out.println("Heavy processes have been happened...");
    }

    @Override
    public void listenToCitizens(Integer citizenNumber) {
        System.out.println("l am listening to citizen with citizen number: " + citizenNumber);
    }

    @Override
    public void makeNote(String note, Boolean isImportant) {
        System.out.println("Minister making notes...");
    }

    @Override
    public void printPapers() {
        System.out.println("Minister prints papers...");
    }

}
