package gangoffour.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        Expression personOne = new TerminalExpression("Kushagra");
        Expression personTwo = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(personOne, personTwo);

        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpreter("Kushagra"));
        System.out.println(isSingle.interpreter("Lokesh"));
        System.out.println(isSingle.interpreter("Achint"));

        System.out.println(isCommitted.interpreter("Committed, Vikram"));
        System.out.println(isCommitted.interpreter("Single, Vikram"));
    }
}