package gangoffour.structural.command;

/**
 * This class is the receiver
 */
public class EWSService {

    public void addMember(String contact, String contactGroup) {
        System.out.println("Added " + contact + " to " + contactGroup);
    }

    public void deleteMember(String contact, String contactGroup) {
        System.out.println("Removed " + contact + " from " + contactGroup);
    }

}
