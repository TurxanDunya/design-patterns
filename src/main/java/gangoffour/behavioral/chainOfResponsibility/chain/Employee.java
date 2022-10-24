package gangoffour.behavioral.chainOfResponsibility.chain;

import gangoffour.behavioral.chainOfResponsibility.DismissalApplication;

/**
 * Abstract handler
 */
public abstract class Employee implements DismissalApprover {

    private final String role;
    private DismissalApprover successor;

    public Employee(String role) {
        this.role = role;
    }

    public Employee(String role, DismissalApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processDismissApplication(DismissalApplication application) {
        if (!processRequest(application) && successor != null) {
            successor.processDismissApplication(application);
        }
    }

    protected abstract boolean processRequest(DismissalApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }

}