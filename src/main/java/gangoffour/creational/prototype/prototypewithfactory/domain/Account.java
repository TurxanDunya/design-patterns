package gangoffour.creational.prototype.prototypewithfactory.domain;

public class Account implements Cloneable {

    private String iban;
    private String number;
    private Boolean isActive;
    private Boolean isNegative;
    private Boolean isFrozen;

    public Account(String iban,
                   String number,
                   Boolean isActive,
                   Boolean isNegative,
                   Boolean isFrozen) {
        this.iban = iban;
        this.number = number;
        this.isActive = isActive;
        this.isNegative = isNegative;
        this.isFrozen = isFrozen;
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getNegative() {
        return isNegative;
    }

    public void setNegative(Boolean negative) {
        isNegative = negative;
    }

    public Boolean getFrozen() {
        return isFrozen;
    }

    public void setFrozen(Boolean frozen) {
        isFrozen = frozen;
    }

}
