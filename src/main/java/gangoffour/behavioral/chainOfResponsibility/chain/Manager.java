package gangoffour.behavioral.chainOfResponsibility.chain;

import gangoffour.behavioral.chainOfResponsibility.DismissalApplication;

//Concrete handler
public class Manager extends Employee {

    public Manager(DismissalApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @Override
    protected boolean processRequest(DismissalApplication application) {
        switch (application.getType()) {
            case SICK:
                return true;
            case PTO:
                if (application.getNoOfDays() <= 5)
                    return true;
        }

        return false;
    }

}