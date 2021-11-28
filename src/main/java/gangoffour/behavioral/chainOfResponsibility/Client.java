package gangoffour.behavioral.chainOfResponsibility;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication leaveApplication = LeaveApplication.builder()
                .type(LeaveApplication.Type.SICK)
                .from(LocalDate.now())
                .to(LocalDate.of(2021, 11, 28))
                .build();

        LeaveApprover approver = createChain();
        approver.processLeaveApplication(leaveApplication);
        System.out.println(leaveApplication);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead projectLead = new ProjectLead(manager);
        return projectLead;
    }
}