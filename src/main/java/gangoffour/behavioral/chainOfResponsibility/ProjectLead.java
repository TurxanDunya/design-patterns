package gangoffour.behavioral.chainOfResponsibility;

public class ProjectLead extends Employee1 {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        return false;
    }
}
