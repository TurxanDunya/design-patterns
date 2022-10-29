package gangoffour.behavioral.state.states;

/**
 * Concrete statement object
 */
public class NormalAccount implements AccountState {

    @Override
    public void withdrawMoney() {
        System.out.println("Money is taken with Normal Account");
    }

    @Override
    public void payInterest() {
        System.out.println("Interest paid with Normal Account");
    }

}
