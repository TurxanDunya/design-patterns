package gangoffour.creational.prototype.prototypewithfactory;

import gangoffour.creational.prototype.prototypewithfactory.domain.Account;

public interface Factory {

    Account createNormalAccount();

    Account createNormalAccount(String number);

    Account createNegativeAccount(String number);

    Account createFrozenAccount(String number);

}
