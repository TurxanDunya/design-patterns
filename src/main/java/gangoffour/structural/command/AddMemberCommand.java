package gangoffour.structural.command;

/**
 * A concrete implementation of Command
 */
public class AddMemberCommand implements Command {

    private String emailAddress;
    private String listName;
    private EWSService receiver;

    public AddMemberCommand(String emailAddress, String listName, EWSService receiver) {
        this.emailAddress = emailAddress;
        this.listName = listName;
        this.receiver = receiver;
    }

    //bu metod ile alici ve islem arasinda elaqe yaratdiq
    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}
