package gangoffour.behavioral.chainOfResponsibility;

//Concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    /**
     * It gives information about whether it handled request or not.
     * If not, request will be pass to next chain.
     */
    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.Type.SICK &&
                application.getNoOfDays() <= 2)
            return true;

        return false;
    }

}