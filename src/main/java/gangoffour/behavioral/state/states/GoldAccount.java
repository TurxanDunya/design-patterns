package gangoffour.behavioral.state.states;

/**
 * Concrete state object
 */
public class GoldAccount implements AccountState {

    @Override
    public void withdrawMoney() {
        System.out.println("Money is taken with Golden Account");
    }

    @Override
    public void payInterest() {
        System.out.println("Interest paid with Golden Account");
    }

}
