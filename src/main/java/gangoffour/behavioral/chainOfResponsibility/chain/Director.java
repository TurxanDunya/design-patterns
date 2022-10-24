package gangoffour.behavioral.chainOfResponsibility.chain;

import gangoffour.behavioral.chainOfResponsibility.DismissalApplication;

//Concrete handler
public class Director extends Employee {

    public Director(DismissalApprover nextApprover) {
        super("Director", nextApprover);
    }

    @Override
    protected boolean processRequest(DismissalApplication application) {
        return application.getType() == DismissalApplication.Type.PTO;
    }

}