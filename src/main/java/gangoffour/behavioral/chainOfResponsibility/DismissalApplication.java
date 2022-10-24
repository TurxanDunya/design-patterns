package gangoffour.behavioral.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import lombok.ToString;

/**
 * It accepts requests and forwarding it to chain.
 *
 * So, in our example, it has managers CHAIN.
 * Depending of type employee leave, each manager has own RESPONSIBILITY.
 * If first manager doesn't have responsibility like that,
 * then request should be pass to next manager on the chain.
 */
@ToString
@Builder
@AllArgsConstructor
public class DismissalApplication {

    // Why employee should leave company
    public enum Type {SICK, PTO, LOP}

    public enum Status {PENDING, APPROVED, REJECTED}

    private final Type type;
    private final LocalDate from;
    private final LocalDate to;
    private String processBy;
    private final Status status;

    public DismissalApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.PENDING;
    }

    public Type getType() {
        return type;
    }

    public Long getNoOfDays() {
        return ChronoUnit.DAYS.between(from, to);
    }

}