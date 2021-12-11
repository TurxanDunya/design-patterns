package gangoffour.behavioral.interpreter;

/**
 * This interpreter just check if the data is same as the interpreter data.
 * And this is TERMINAL expression.
 */
public class TerminalExpression implements Expression {

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpreter(String con) {
        return con.contains(data);
    }

}