package gangoffour.behavioral.chainOfResponsibility;

/**
 * Abstract handler
 */
public abstract class Employee1 implements LeaveApprover {

    private String role;
    private LeaveApprover successor;

    public Employee1(String role) {
        this.role = role;
    }

    public Employee1(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (!processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}
