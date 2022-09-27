package gangoffour.creational.prototype.prototypewithfactory;

import gangoffour.creational.prototype.prototypewithfactory.domain.Account;

public class AccountFactory implements Factory {

    @Override
    public Account createNormalAccount() {
        return AccountPrototypes.normalPrototype.clone();
    }

    @Override
    public Account createNormalAccount(String number) {
        Account account = AccountPrototypes.normalPrototype.clone();
        account.setNumber(number);
        return account;
    }

    @Override
    public Account createNegativeAccount(String number) {
        Account account = AccountPrototypes.negativePrototype.clone();
        account.setNumber("-" + number);
        return account;
    }

    @Override
    public Account createFrozenAccount(String number) {
        Account account = AccountPrototypes.frozenPrototype.clone();
        account.setNumber("Invalid " + number);
        return account;
    }

    static class AccountPrototypes {
        static Account normalPrototype = new Account("1", "1234", true, false, false);
        static Account negativePrototype = new Account("1", "1234", true, true, false);
        static Account frozenPrototype = new Account("1", "1234", true, true, true);
    }

}
