package gangoffour.structural.proxy;

/**
 * Actually proxy handles requests.
 */
public class ProxyImpl implements Minister {

    private Minister minister;

    @Override
    public void listenToCitizens(Integer citizenNumber) {
        if (citizenNumber % 2 == 0) {
            handleMinisterObject();
            minister.listenToCitizens(citizenNumber);
        }
    }

    @Override
    public void makeNote(String note, Boolean isImportant) {
        if (isImportant) {
            handleMinisterObject();
            minister.makeNote(note, true);
        }

        System.out.println("Hey, it is not so important for minister");
    }

    @Override
    public void printPapers() {
        System.out.println("Hey, minister can not print papers");
    }

    private void handleMinisterObject() {
        if (minister == null) {
            minister = new MinisterImpl();
        }
    }

}
