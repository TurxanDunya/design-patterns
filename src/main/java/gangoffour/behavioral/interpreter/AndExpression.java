package gangoffour.behavioral.interpreter;

/**
 * This interpreter just returns the AND condition of the data is same as the interpreter data.
 * And this is NON-TERMINAL expression.
 */
public class AndExpression implements Expression {

    Expression expressionOne;
    Expression expressionTwo;

    public AndExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    public boolean interpreter(String con) {
        return expressionOne.interpreter(con) && expressionTwo.interpreter(con);
    }

}