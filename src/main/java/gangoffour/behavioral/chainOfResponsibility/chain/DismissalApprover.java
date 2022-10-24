package gangoffour.behavioral.chainOfResponsibility.chain;

import gangoffour.behavioral.chainOfResponsibility.DismissalApplication;

/**
 * This represents a handler in chain of responsibility.
 */
public interface DismissalApprover {

    void processDismissApplication(DismissalApplication application);

    String getApproverRole();

}
