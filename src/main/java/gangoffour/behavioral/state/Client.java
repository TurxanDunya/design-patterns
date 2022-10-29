package gangoffour.behavioral.state;

import gangoffour.behavioral.state.states.GoldAccount;

public class Client {
    public static void main(String[] args) {
        AccountContext context = new AccountContext();
        context.withdrawMoney();
        context.payInterest();

        context.changeStatus(new GoldAccount());
        context.withdrawMoney();
        context.payInterest();
    }
}
