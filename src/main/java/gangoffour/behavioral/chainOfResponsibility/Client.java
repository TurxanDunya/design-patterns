package gangoffour.behavioral.chainOfResponsibility;

import gangoffour.behavioral.chainOfResponsibility.chain.Director;
import gangoffour.behavioral.chainOfResponsibility.chain.DismissalApprover;
import gangoffour.behavioral.chainOfResponsibility.chain.Manager;
import gangoffour.behavioral.chainOfResponsibility.chain.ProjectLead;
import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        // We send dismissal document to responsible approver
        DismissalApplication dismissalApplication = DismissalApplication.builder()
                .type(DismissalApplication.Type.SICK)
                .from(LocalDate.now())
                .to(LocalDate.of(2021, 11, 28))
                .build();

        DismissalApprover approver = createChain();
        approver.processDismissApplication(dismissalApplication);
        System.out.println(dismissalApplication);
    }

    private static DismissalApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }

}