package gangoffour.behavioral.chainOfResponsibility;

import java.time.LocalDate;

public class LeaveApplication {

    public enum Type {Sick, PTO, LOP};

    public enum Status {Pending, Approved, Rejected};

    private Type type;

    private LocalDate from;

    private LocalDate to;

    private String processBy;

    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType() {
        return type;
    }
}
