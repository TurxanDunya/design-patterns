package gangoffour.behavioral.chainOfResponsibility.chain;

import gangoffour.behavioral.chainOfResponsibility.DismissalApplication;

//Concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(DismissalApprover successor) {
        super("Project Lead", successor);
    }

    /**
     * It gives information about whether it handled request or not.
     * If not, request will be pass to next chain.
     */
    @Override
    protected boolean processRequest(DismissalApplication application) {
        return application.getType() == DismissalApplication.Type.SICK &&
                application.getNoOfDays() <= 2;
    }

}