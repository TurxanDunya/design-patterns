package gangoffour.behavioral.chainOfResponsibility;

//Concrete handler
public class Manager extends Employee {

    public Manager(LeaveApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
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