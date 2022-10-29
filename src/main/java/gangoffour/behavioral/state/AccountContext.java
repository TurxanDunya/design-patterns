package gangoffour.behavioral.state;

import gangoffour.behavioral.state.states.AccountState;
import gangoffour.behavioral.state.states.NormalAccount;

/**
 * A context object which controls states and changes states
 */
public class AccountContext {

    private AccountState accountState;

    // The default state is Normal Account
    public AccountContext() {
        this.accountState = new NormalAccount();
    }

    // Just calls relevant state object by polymorphism
    public void payInterest() {
        accountState.payInterest();
    }

    // Just calls relevant state object by polymorphism
    public void withdrawMoney() {
        accountState.withdrawMoney();
    }

    // Changes the state
    public void changeStatus(AccountState accountState) {
        this.accountState = accountState;
    }

}
